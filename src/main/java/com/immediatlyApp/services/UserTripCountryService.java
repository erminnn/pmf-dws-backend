package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.UserTripCountry;
import com.immediatlyApp.repositories.UserTripCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTripCountryService {
    private final UserTripCountryRepository userTripCountryRepository;

    public List<UserTripCountry> getUserCountries() {
        return userTripCountryRepository.findAll();
    }

    public void addUserTripCountry(UserTripCountry userTripCountry) {
        userTripCountryRepository.save(userTripCountry);
    }
}
