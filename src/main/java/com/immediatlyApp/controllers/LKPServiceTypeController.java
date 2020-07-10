package com.immediatlyApp.controllers;

import com.immediatlyApp.models.lookups.LKPServiceType;
import com.immediatlyApp.services.LKPServiceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service-type")
public class LKPServiceTypeController {
    private final LKPServiceTypeService serviceTypeService;

    @GetMapping("/all")
    public List<LKPServiceType> getServiceTypes(){
        return serviceTypeService.getServiceTypes();
    }

    @PostMapping("/add")
    public void addServiceType(@RequestBody @Valid LKPServiceType serviceType){
        serviceTypeService.addServiceType(serviceType);
    }
}
