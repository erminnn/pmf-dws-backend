package com.immediatlyApp.controllers;

import com.immediatlyApp.models.lookups.LKPPlaceFilter;
import com.immediatlyApp.services.LKPPlaceFilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/place-filter")
public class LKPPlaceFilterController {
    private final LKPPlaceFilterService placeFilterService;

    @GetMapping("/all")
    public List<LKPPlaceFilter> getPlaceFilters(){
        return placeFilterService.getPlaceFilters();
    }

    @PostMapping("/add")
    public void addPlaceFilter(@RequestBody @Valid LKPPlaceFilter placeFilter){
        placeFilterService.addPlaceFilter(placeFilter);
    }
}
