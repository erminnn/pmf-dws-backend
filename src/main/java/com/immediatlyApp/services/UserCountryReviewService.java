package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.UserCountryReview;
import com.immediatlyApp.repositories.UserCountryReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCountryReviewService {
    private final UserCountryReviewRepository userCountryReviewRepository;


    public List<UserCountryReview> getUserCountryReviews() {
        return userCountryReviewRepository.findAll();
    }

    public void addUserCountryReview(UserCountryReview userCountryReview) {
        userCountryReviewRepository.save(userCountryReview);
    }

    public List<UserCountryReview> getUserCountryReviewsByUsername(String username) {
        return userCountryReviewRepository.getUserCountryReviewsByUsername(username);
    }

    public UserCountryReview getUserCountryReviewById(Long id) {
        return userCountryReviewRepository.getUserCountryReviewById(id);
    }

    public void updateUserCountryReview(UserCountryReview userCountryReview) {
        userCountryReviewRepository.save(userCountryReview);
    }

    public void deleteUserCountryReviewById(Long id) {
        userCountryReviewRepository.deleteUserCountryReviewById(id);
    }
}
