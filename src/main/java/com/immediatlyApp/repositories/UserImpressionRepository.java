package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.UserImpression;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserImpressionRepository extends JpaRepository<UserImpression,Long> {
}
