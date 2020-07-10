package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.models.lookups.LKPCountry;
import com.immediatlyApp.repositories.LKPCountryRepository;
import com.immediatlyApp.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;
    private final LKPCountryRepository countryRepository;
    private final PasswordEncoder bcryptEncoder;


    public void addUser(User user){
        user.setPassword(bcryptEncoder.encode(user.getPassword()));
        String defaultProfileImage = "https://res.cloudinary.com/dfts3meqq/image/upload/v1594156358/immediately/qow8hfvhdcrxocw62dqn.jpg";
        user.setProfileImage(defaultProfileImage);
        userRepository.save(user);
    }
    public void updateUser(User editedUser) throws UnsupportedEncodingException {
        if(editedUser.getProfileImage() != null){
            String decodeProfileImageURL = java.net.URLDecoder.decode(editedUser.getProfileImage(), StandardCharsets.UTF_8.name());
            editedUser.setProfileImage(decodeProfileImageURL);
        }
        if(editedUser.getPassword() != null){
            editedUser.setPassword(bcryptEncoder.encode(editedUser.getPassword()));
        }
        User existingUser = userRepository.findByUsername(editedUser.getUsername());
        myCopyProperties(editedUser,existingUser);
        userRepository.save(existingUser);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void deleteById(Long id){
        if (id == null) {
            throw new IllegalArgumentException("User id must be specified!");
        }
        try{
            userRepository.deleteById(id);
        }catch (Exception e){
            throw new IllegalArgumentException("Could not delete user");
        }
    }




    public String getUserProfileImage(String user) {
        return userRepository.getUserProfileImage(user);
    }

    public static String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }

        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    // then use Spring BeanUtils to copy and ignore null using our function
    public static void myCopyProperties(Object src, Object target) {
        BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
    }

    public Long getUserIdByUsername(String username) {
        return userRepository.getUserIdByUsername(username);
    }
}
