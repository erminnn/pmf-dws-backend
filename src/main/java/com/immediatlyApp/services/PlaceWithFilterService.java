package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.PlaceWithFilter;
import com.immediatlyApp.repositories.PlaceWithFilterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceWithFilterService {
    private final PlaceWithFilterRepository placeWithFilterRepository;

    public List<PlaceWithFilter> getPlacesWithFilter() {
        return placeWithFilterRepository.findAll();
    }

    public void addPlaceWithFilter(PlaceWithFilter placeWithFilter) {
        placeWithFilterRepository.save(placeWithFilter);
    }
}
