package com.salary.mapper;

import com.salary.pojo.Teachercourse;
import com.salary.pojo.TeachercourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachercourseMapper {
    int countByExample(TeachercourseExample example);

    int deleteByExample(TeachercourseExample example);

    int deleteByPrimaryKey(Integer teachercourseId);

    int insert(Teachercourse record);

    int insertSelective(Teachercourse record);

    List<Teachercourse> selectByExample(TeachercourseExample example);

    Teachercourse selectByPrimaryKey(Integer teachercourseId);

    int updateByExampleSelective(@Param("record") Teachercourse record, @Param("example") TeachercourseExample example);

    int updateByExample(@Param("record") Teachercourse record, @Param("example") TeachercourseExample example);

    int updateByPrimaryKeySelective(Teachercourse record);

    int updateByPrimaryKey(Teachercourse record);
}