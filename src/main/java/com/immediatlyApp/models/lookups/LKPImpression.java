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


@Data
@Entity
@Table (name = "LKP_Impression")
@NoArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "impression_id"))
public class LKPImpression extends LookupEntity {
    public LKPImpression(@NotNull String name, @NotNull String key) {
        super(name, key);
    }
}
