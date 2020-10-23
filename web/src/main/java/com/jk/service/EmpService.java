package com.jk.service;

import com.jk.entity.EmpEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("emp-provider")
public interface EmpService {

    @RequestMapping("findEmp")
    public List<EmpEntity> findEmp();

    @RequestMapping("saveEmp")
    public void saveEmp(@RequestBody EmpEntity empEntity);

    @RequestMapping("deleteEmp")
    public void deleteEmp(@RequestParam Integer empId);

    @RequestMapping("findById")
    public EmpEntity findById(@RequestParam Integer empId);

    @RequestMapping("findDept")
    public List<EmpEntity> findDept();
}
