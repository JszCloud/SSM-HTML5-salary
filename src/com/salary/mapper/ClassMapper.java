package com.salary.mapper;

import com.salary.pojo.Class;
import com.salary.pojo.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    int countByExample(ClassExample example);

    int deleteByExample(ClassExample example);

    int insert(Class record);

    int insertSelective(Class record);

    List<Class> selectByExample(ClassExample example);

    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);
}