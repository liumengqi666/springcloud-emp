package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmpEntity implements Serializable {
    //id、名称、部门（两表）、入职日期、岗位、职责）
    private Integer empId;
    private String empName;
    private Integer deptId;
    private String empDate;
    private String empPosition;
    private String  empResponsibility;
    private String deptName;

}
