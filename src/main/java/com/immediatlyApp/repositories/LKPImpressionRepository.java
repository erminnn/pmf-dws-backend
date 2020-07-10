package com.immediatlyApp.repositories;


import com.immediatlyApp.models.lookups.LKPImpression;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LKPImpressionRepository extends JpaRepository<LKPImpression,Long> {

    LKPImpression findLKPImpressionByName(String name);
  //  LKPImpression findLKPImpressionByKey(String key);

}
