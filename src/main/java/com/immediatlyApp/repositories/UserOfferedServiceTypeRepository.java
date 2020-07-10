package com.immediatlyApp.repositories;

import com.immediatlyApp.models.entity.UserOfferServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserOfferedServiceTypeRepository extends JpaRepository <UserOfferServiceType,Long> {
    @Query("SELECT uost from UserOfferServiceType uost where uost.user.username = :username ")
    List<UserOfferServiceType> getUserOfferServiceTypesByUsername(String username);

    @Query("SELECT uost from UserOfferServiceType uost where uost.id = :offerServiceId")
    UserOfferServiceType getUserOfferServiceById(Long offerServiceId);

    @Transactional
    @Modifying
    @Query("DELETE from UserOfferServiceType uost where uost.id = :id ")
    void deleteUserOfferService(Long id);
}
