package com.immediatlyApp.repositories;

import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LKPCountryRepository extends JpaRepository<LKPCountry,Long> {
    LKPCountry findLKPCountryByName(String name);
}
