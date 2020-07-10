package com.immediatlyApp.services;

import com.immediatlyApp.models.lookups.LKPCountry;
import com.immediatlyApp.repositories.LKPCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LKPCountryService {
    private final LKPCountryRepository countryRepository;

    public List<LKPCountry> getCountries() {
        return countryRepository.findAll();
    }

    public void addCountry(LKPCountry country){
        countryRepository.save(country);
    }
}
