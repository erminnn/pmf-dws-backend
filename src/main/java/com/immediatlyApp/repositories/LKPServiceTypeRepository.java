package com.immediatlyApp.repositories;

import com.immediatlyApp.models.lookups.LKPServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LKPServiceTypeRepository extends JpaRepository<LKPServiceType, Long> {
    LKPServiceType findLKPServiceByName(String name);
    //LKPServiceType findLKPServiceByKey(String key);
}
