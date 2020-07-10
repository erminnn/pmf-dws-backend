package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPPlaceFilter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "place_with_filter_id"))
public class PlaceWithFilter extends BaseEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "place_filter_id")
    LKPPlaceFilter placeFilter;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_country_review_id")
    UserCountryReview userCountryReview;
}
