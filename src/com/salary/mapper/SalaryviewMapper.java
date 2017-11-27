package com.salary.mapper;

import com.salary.pojo.Salaryview;
import com.salary.pojo.SalaryviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryviewMapper {
    int countByExample(SalaryviewExample example);

    int deleteByExample(SalaryviewExample example);

    int insert(Salaryview record);

    int insertSelective(Salaryview record);

    List<Salaryview> selectByExample(SalaryviewExample example);

    int updateByExampleSelective(@Param("record") Salaryview record, @Param("example") SalaryviewExample example);

    int updateByExample(@Param("record") Salaryview record, @Param("example") SalaryviewExample example);
}