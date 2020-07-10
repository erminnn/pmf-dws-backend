package com.immediatlyApp.controllers;


import com.immediatlyApp.models.lookups.LKPImpression;
import com.immediatlyApp.services.LKPImpressionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/impression")
public class LKPImpressionController {
    private final LKPImpressionService impressionService;

    @PostMapping("/add")
    public void addImpression(@RequestBody @Valid LKPImpression impression){
        impressionService.addImpression(impression);
    }

    @GetMapping("/all")
    public List<LKPImpression> getImpressions(){
        return  impressionService.getImpressions();
    }
}
