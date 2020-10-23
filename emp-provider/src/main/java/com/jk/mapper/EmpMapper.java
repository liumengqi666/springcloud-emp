package com.jk.mapper;

import com.jk.entity.EmpEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmpMapper {

    @Insert("insert into jk_emp(empName,deptId,empDate,empPosition,empResponsibility) values(#{empName},#{deptId},#{deptDate},#{empPosition},#{empResponsibility})")
    void saveEmp(EmpEntity empEntity);

    @Select("select e.*,d.deptName deptName from jk_emp e,jk_dept d where e.deptId=d.deptId")
    List<EmpEntity> findAll();

    @Delete("delete from jk_emp where empId =#{empId}")
    void deleteById(Integer empId);

    @Select("select * from jk_emp where empId =#{empId}")
    EmpEntity findById(Integer empId);

    @Update("update jk_emp set empName=#{empName},deptId=#{deptId},deptDate=#{deptDate},empPosition=#{empPosition},empResponsibility=#{empResponsibility}  where  empId=#{empId}")
    void updateEmp(EmpEntity empEntity);

    @Select("select * from jk_dept")
    List<EmpEntity> findDept();
}
