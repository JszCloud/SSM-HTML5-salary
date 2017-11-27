package com.salary.mapper;

import com.salary.pojo.Callnames;
import com.salary.pojo.CallnamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallnamesMapper {
    int countByExample(CallnamesExample example);

    int deleteByExample(CallnamesExample example);

    int insert(Callnames record);

    int insertSelective(Callnames record);

    List<Callnames> selectByExample(CallnamesExample example);

    int updateByExampleSelective(@Param("record") Callnames record, @Param("example") CallnamesExample example);

    int updateByExample(@Param("record") Callnames record, @Param("example") CallnamesExample example);
}