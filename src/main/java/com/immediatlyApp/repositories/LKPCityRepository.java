package com.immediatlyApp.repositories;

import com.immediatlyApp.models.lookups.LKPCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LKPCityRepository extends JpaRepository<LKPCity,Long> {
    LKPCity findLKPCityByName(String name);
  //  LKPCity findLKPCityByKey(String key);
  @Query("SELECT lp from LKPCity lp where lp.country.id = :countryId")
  List<LKPCity> getCitiesByCountryId(Long countryId);
}
