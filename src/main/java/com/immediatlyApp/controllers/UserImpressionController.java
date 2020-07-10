package com.immediatlyApp.controllers;

import com.immediatlyApp.models.entity.UserImpression;
import com.immediatlyApp.services.UserImpressionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user-impression")
public class UserImpressionController {
    private final UserImpressionService userImpressionService;

    @GetMapping("/all")
    public List<UserImpression> getUserImpression(){
        return userImpressionService.getUserImpression();
    }

    @PostMapping("/add")
    public void addUserImpression(@RequestBody @Valid UserImpression userImpression){
        userImpressionService.addUserImpression(userImpression);
    }


}
