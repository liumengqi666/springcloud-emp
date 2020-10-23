package com.jk.service;


import com.jk.entity.EmpEntity;

import java.util.List;

public interface EmpService {
    void saveEmp(EmpEntity empEntity);

    List<EmpEntity> findEmp();

    void deleteEmp(Integer empId);

    EmpEntity findById(Integer empId);

    List<EmpEntity> findDept();
}
