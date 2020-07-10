package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.UserImpression;
import com.immediatlyApp.repositories.UserImpressionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpressionService {
    private final UserImpressionRepository userImpressionRepository;


    public List<UserImpression> getUserImpression() {
        return userImpressionRepository.findAll();
    }

    public void addUserImpression(UserImpression userImpression) {
        userImpressionRepository.save(userImpression);
    }
}
