package com.immediatlyApp.services;

import com.immediatlyApp.models.lookups.LKPServiceType;
import com.immediatlyApp.repositories.LKPServiceTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LKPServiceTypeService {
    private final LKPServiceTypeRepository serviceTypeRepository;

    public List<LKPServiceType> getServiceTypes() {
        return serviceTypeRepository.findAll();
    }

    public void addServiceType(LKPServiceType serviceType) {
        serviceTypeRepository.save(serviceType);
    }
}
