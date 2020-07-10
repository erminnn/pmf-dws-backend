package com.immediatlyApp.services;

import com.immediatlyApp.models.entity.UserDidServiceType;
import com.immediatlyApp.repositories.UserDidServiceTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDidServiceTypeService {
    private final UserDidServiceTypeRepository userDidServiceTypeRepository;

    public List<UserDidServiceType> getUserDidServiceTypes() {
        return userDidServiceTypeRepository.findAll();
    }

    public void addUserDidServiceType(UserDidServiceType userDidServiceType) {
        userDidServiceTypeRepository.save(userDidServiceType);
    }
}
