package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    @Override
    @Query("SELECT u FROM User u INNER JOIN u.country")
    List<User> findAll();



    @Query("SELECT profileImage from User where username = :user")
    String getUserProfileImage(String user);

    @Query("SELECT u.id from User u where u.username = :username")
    Long getUserIdByUsername(String username);
}


