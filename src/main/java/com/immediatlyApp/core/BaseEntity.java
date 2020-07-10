package com.immediatlyApp.core;


import lombok.Getter;

import javax.persistence.*;
@Getter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    Long id;

    protected BaseEntity(){
        id = null;
    }
}
