package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeptEntity implements Serializable {

    private Integer deptId;
    private String deptName;
}
