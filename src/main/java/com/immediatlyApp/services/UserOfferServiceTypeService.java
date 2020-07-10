package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.repositories.UserOfferedServiceTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserOfferServiceTypeService {
    private final UserOfferedServiceTypeRepository userOfferedServiceTypeRepository;


    public void addUserOfferServiceType(UserOfferServiceType userOfferServiceType) throws UnsupportedEncodingException {
        String decodeServiceImageURL = java.net.URLDecoder.decode(userOfferServiceType.getServiceImg(), StandardCharsets.UTF_8.name());
        userOfferServiceType.setServiceImg(decodeServiceImageURL);
        userOfferedServiceTypeRepository.save(userOfferServiceType);
    }

    public List<UserOfferServiceType> getUserOfferServiceTypes() {
        return userOfferedServiceTypeRepository.findAll();
    }


    public List<UserOfferServiceType> getUserOfferServiceTypesByUsername(String username) {
        return userOfferedServiceTypeRepository.getUserOfferServiceTypesByUsername(username);
    }

    public UserOfferServiceType getUserOfferServiceById(Long id) {
        return userOfferedServiceTypeRepository.getUserOfferServiceById(id);
    }

    public void updateUserOfferService(UserOfferServiceType userOfferServiceType) {
        userOfferedServiceTypeRepository.save(userOfferServiceType);
    }

    public void deleteUserOfferService(Long id) {
        userOfferedServiceTypeRepository.deleteUserOfferService(id);
    }
}
