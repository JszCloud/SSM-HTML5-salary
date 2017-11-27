package com.salary.mapper;

import com.salary.pojo.Selectcourse;
import com.salary.pojo.SelectcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectcourseMapper {
    int countByExample(SelectcourseExample example);

    int deleteByExample(SelectcourseExample example);

    int insert(Selectcourse record);

    int insertSelective(Selectcourse record);

    List<Selectcourse> selectByExample(SelectcourseExample example);

    int updateByExampleSelective(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);

    int updateByExample(@Param("record") Selectcourse record, @Param("example") SelectcourseExample example);
}