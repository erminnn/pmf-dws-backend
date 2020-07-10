package com.immediatlyApp.controllers;


import com.immediatlyApp.models.entity.UserDidServiceType;
import com.immediatlyApp.services.UserDidServiceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-did-service-type")
public class UserDidServiceTypeController {
    private final UserDidServiceTypeService userDidServiceTypeService;
    @GetMapping("/all")
    public List<UserDidServiceType> getUserDidServiceTypes(){
        return userDidServiceTypeService.getUserDidServiceTypes();
    }

    @PostMapping("/add")
    public void addUserDidServiceType(@RequestBody @Valid UserDidServiceType userDidServiceType){
        userDidServiceTypeService.addUserDidServiceType(userDidServiceType);
    }

}
