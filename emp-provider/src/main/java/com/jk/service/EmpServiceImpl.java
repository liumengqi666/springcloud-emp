package com.jk.service;

import com.jk.entity.EmpEntity;
import com.jk.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpMapper empMapper;

    @Override
    public void saveEmp(EmpEntity empEntity) {
        if (empEntity.getEmpId()==null){
            empMapper.saveEmp(empEntity);
        }else{
            empMapper.updateEmp(empEntity);
        }

    }

    @Override
    public List<EmpEntity> findEmp() {
        return empMapper.findAll();
    }

    @Override
    public void deleteEmp(Integer empId) {
        empMapper.deleteById(empId);
    }

    @Override
    public EmpEntity findById(Integer empId) {
        return empMapper.findById(empId);
    }

    @Override
    public List<EmpEntity> findDept() {

        return empMapper.findDept();
    }


}
