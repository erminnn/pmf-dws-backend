package com.immediatlyApp.services;

import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.repositories.LKPCityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LKPCityService {
    private final LKPCityRepository cityRepository;

    public List<LKPCity> getCities() {
        return  cityRepository.findAll();
    }

    public void addCity(LKPCity city){
        cityRepository.save(city);
    }

    public List<LKPCity> getCitiesByCountryId(Long countryId) {
        return cityRepository.getCitiesByCountryId(countryId);
    }
}
