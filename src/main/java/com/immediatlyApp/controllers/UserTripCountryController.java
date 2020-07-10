package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.UserTripCountry;
import com.immediatlyApp.services.UserTripCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-country")
public class UserTripCountryController {
    private final UserTripCountryService userTripCountryService;

    @GetMapping("/all")
    public List<UserTripCountry> getUserCountries(){
        return userTripCountryService.getUserCountries();
    }

    @PostMapping("/add")
    public void addUserTripCountry(@RequestBody @Valid UserTripCountry userTripCountry){
        userTripCountryService.addUserTripCountry(userTripCountry);
    }
}
