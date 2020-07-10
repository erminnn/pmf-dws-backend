package com.immediatlyApp.services;

import com.immediatlyApp.models.lookups.LKPImpression;
import com.immediatlyApp.repositories.LKPImpressionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LKPImpressionService {
    private final LKPImpressionRepository impressionRepository;


    public void addImpression(LKPImpression impression) {
        impressionRepository.save(impression);
    }

    public List<LKPImpression> getImpressions() {
        return impressionRepository.findAll();
    }
}
