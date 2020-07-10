package com.immediatlyApp.repositories;

import com.immediatlyApp.models.lookups.LKPPlaceFilter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LKPPlaceFilterRepository extends JpaRepository<LKPPlaceFilter,Long> {
    LKPPlaceFilter findLKPPlaceFilterByName(String name);
  //  LKPPlaceFilter findLKPPlaceFilterByKey(String key);
}
