package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TypeEntity implements Serializable {
    private Integer typeId;
    private String typeName;
}
