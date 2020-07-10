package com.immediatlyApp.controllers;

import com.immediatlyApp.models.lookups.LKPCountry;
import com.immediatlyApp.services.LKPCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/country")
public class LKPCountryController {

    private final LKPCountryService countryService;

    @PostMapping("/add")
    public void addCountry(@RequestBody @Valid LKPCountry country){
        countryService.addCountry(country);
    }

    @GetMapping("/all")
    public List<LKPCountry> getCountries(){
        return  countryService.getCountries();
    }
}
