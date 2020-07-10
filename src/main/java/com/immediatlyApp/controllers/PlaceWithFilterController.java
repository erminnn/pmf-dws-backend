package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.PlaceWithFilter;
import com.immediatlyApp.services.PlaceWithFilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/place-with-filter")
public class PlaceWithFilterController {
    private final PlaceWithFilterService placeWithFilterService;

    @GetMapping("/all")
    public List<PlaceWithFilter> getPlacesWithFilter(){
        return placeWithFilterService.getPlacesWithFilter();
    }

    @PostMapping("/add")
    public void addPlaceWithFilter(@RequestBody @Valid PlaceWithFilter placeWithFilter){
        placeWithFilterService.addPlaceWithFilter(placeWithFilter);
    }
}
