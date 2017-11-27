package com.salary.mapper;

import com.salary.pojo.Leave;
import com.salary.pojo.LeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMapper {
    int countByExample(LeaveExample example);

    int deleteByExample(LeaveExample example);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByExample(LeaveExample example);

    int updateByExampleSelective(@Param("record") Leave record, @Param("example") LeaveExample example);

    int updateByExample(@Param("record") Leave record, @Param("example") LeaveExample example);
}