package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.UserCountryReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserCountryReviewRepository extends JpaRepository<UserCountryReview,Long> {
    @Query("SELECT ucr from UserCountryReview ucr where ucr.user.username = :username")
    List<UserCountryReview> getUserCountryReviewsByUsername(String username);

    @Query("SELECT ucr from UserCountryReview  ucr where ucr.id = :id")
    UserCountryReview getUserCountryReviewById(Long id);

    @Transactional
    @Modifying
    @Query("DELETE from UserCountryReview ucr where ucr.id = :id ")
    void deleteUserCountryReviewById(Long id);
}
