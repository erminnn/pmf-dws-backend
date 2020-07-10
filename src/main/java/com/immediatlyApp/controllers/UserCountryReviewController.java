package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.User;
import com.immediatlyApp.models.entity.UserCountryReview;
import com.immediatlyApp.models.entity.UserOfferServiceType;
import com.immediatlyApp.services.UserCountryReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-country-review")
public class UserCountryReviewController {
    private final UserCountryReviewService userCountryReviewService;

    @GetMapping("/all")
    public List<UserCountryReview> getUserCountryReviews(){
        return userCountryReviewService.getUserCountryReviews();
    }

    @PostMapping("/add")
    public void addUserCountryReview(@RequestBody @Valid UserCountryReview userCountryReview){
        userCountryReviewService.addUserCountryReview(userCountryReview);
    }

    @GetMapping("/{username}")
    public List<UserCountryReview> getUserCountryReviewsByUsername(@PathVariable String username){
        return userCountryReviewService.getUserCountryReviewsByUsername(username);
    }

    @GetMapping("/country-review/{id}")
    public UserCountryReview getUserCountryReviewById(@PathVariable String id){
        return userCountryReviewService.getUserCountryReviewById(Long.parseLong(id));
    }

    @PostMapping(value = "/country-review/update")
    public void updateUserCountryReview(@RequestBody UserCountryReview userCountryReview) throws UnsupportedEncodingException {
        userCountryReviewService.updateUserCountryReview(userCountryReview);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserCountryReviewById(@PathVariable String id){
        userCountryReviewService.deleteUserCountryReviewById(Long.parseLong(id));
    }
}
