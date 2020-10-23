package com.jk.controller;

import com.jk.entity.EmpEntity;
import com.jk.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;


    @RequestMapping("findEmp")
    public String findEmp(Model model){
        model.addAttribute("emp",empService.findEmp());
        return "emp";
    }

    @RequestMapping("toAdd")
    public String toAdd(Model model){
        List<EmpEntity> empEntityList=empService.findDept();
        model.addAttribute("emp",new EmpEntity());
        model.addAttribute("empEntityList",empEntityList);
        return  "add";
    }



    @RequestMapping("saveEmp")
    public String saveEmp(EmpEntity empEntity){
        empService.saveEmp(empEntity);
        return "redirect:findEmp";
    }

    @RequestMapping("deleteEmp")
    public String deleteEmp(Integer empId){

        empService.deleteEmp(empId);

        return "redirect:findEmp";
    }

    @RequestMapping("findById")
    public String findById(Integer empId,Model model){
        List<EmpEntity> empEntityList=empService.findDept();
        model.addAttribute("emp", empService.findById(empId));
        model.addAttribute("empEntityList",empEntityList);
        return "add";
    }


}
