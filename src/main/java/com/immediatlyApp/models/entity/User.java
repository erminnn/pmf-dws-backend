package com.immediatlyApp.models.entity;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.models.lookups.LKPCity;
import com.immediatlyApp.models.lookups.LKPCountry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "user_id"))
public class User  extends BaseEntity{

    @Column(length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String username;

    @Column(length = 100)
    @NotNull
    @Size(min = 4, max = 100)
    private String password;

    @Column(length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String firstName;

    @Column(length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String lastName;

    @Column(length = 50, unique = true)
    @NotNull
    @Size(min = 4, max = 50)
    private String email;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @NotNull
    private Date dateOfBirth;


    private String profileImage;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @NotNull
    private LKPCountry country;

    @ManyToOne
    @JoinColumn(name = "city_id")
    @NotNull
    private LKPCity city;

}
