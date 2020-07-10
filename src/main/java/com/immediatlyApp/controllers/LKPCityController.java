package com.immediatlyApp.controllers;

import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.services.LKPCityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/city")
public class LKPCityController {
    private final LKPCityService cityService;

    @GetMapping("/all")
    public List<LKPCity> getCities(){
        return cityService.getCities();
    }

    @PostMapping("/add")
    public void addCity(@RequestBody @Valid LKPCity city){
        cityService.addCity(city);
    }

    @GetMapping("/country-id/{countryId}")
    public List<LKPCity> getCitiesByCountryId(@PathVariable Long countryId){
        return cityService.getCitiesByCountryId(countryId);
    }




}
