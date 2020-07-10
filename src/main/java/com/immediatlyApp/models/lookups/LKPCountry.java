package com.immediatlyApp.models.lookups;

import com.immediatlyApp.core.BaseEntity;
import com.immediatlyApp.core.LookupEntity;
import com.immediatlyApp.models.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;


@Data
@Entity
@Table(name = "LKP_Country")
@NoArgsConstructor
@AttributeOverride(name = "id" ,column = @Column(name = "country_id"))
public class LKPCountry extends LookupEntity {
    public LKPCountry(@NotNull String name, @NotNull String key) {
        super(name, key);
    }

}
