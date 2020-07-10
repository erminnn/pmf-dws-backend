package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.core.LookupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "LKP_Place_Filter")
@NoArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "place_filter_id"))
public class LKPPlaceFilter extends LookupEntity {
    public LKPPlaceFilter(@NotNull String name, @NotNull String key) {
        super(name, key);
    }
}
