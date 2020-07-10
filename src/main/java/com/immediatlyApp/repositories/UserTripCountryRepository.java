package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.UserTripCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTripCountryRepository extends JpaRepository<UserTripCountry,Long> {
}
