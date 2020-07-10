package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPImpression;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "user_impression_id"))
public class UserImpression extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "impression_id")
    LKPImpression impression;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}