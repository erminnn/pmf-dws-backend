package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.core.LookupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "LKP_City")
@NoArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "city_id"))

public class LKPCity extends LookupEntity {
    public LKPCity(@NotNull String name, @NotNull String key,@NotNull LKPCountry country) {
        super(name, key);
        this.country = country;
    }


    @ManyToOne
    @JoinColumn(name = "country_id")
    private LKPCountry country;

}
