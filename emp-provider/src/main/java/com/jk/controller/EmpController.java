package com.jk.controller;

import com.jk.entity.EmpEntity;
import com.jk.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("findEmp")
    public List<EmpEntity> findEmp(){

        return empService.findEmp();
    }
    @RequestMapping("findDept")
    public List<EmpEntity> findDept(){
        return empService.findDept();
    }

    @RequestMapping("saveEmp")
    public void saveEmp(@RequestBody EmpEntity empEntity){

        empService.saveEmp(empEntity);
    }

    @RequestMapping("deleteEmp")
    public void deleteEmp(@RequestParam Integer empId){

        empService.deleteEmp(empId);
    }

    @RequestMapping("findById")
    public EmpEntity findById(@RequestParam Integer empId){


        return  empService.findById(empId);
    }

}
