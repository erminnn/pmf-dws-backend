package com.immediatlyApp.services;

import com.immediatlyApp.models.lookups.LKPPlaceFilter;
import com.immediatlyApp.repositories.LKPPlaceFilterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LKPPlaceFilterService {
    private final LKPPlaceFilterRepository placeFilterRepository;

    public List<LKPPlaceFilter> getPlaceFilters() {
        return placeFilterRepository.findAll();
    }

    public void addPlaceFilter(LKPPlaceFilter placeFilter) {
        placeFilterRepository.save(placeFilter);
    }
}
