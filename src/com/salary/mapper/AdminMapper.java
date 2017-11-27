package com.salary.mapper;

import com.salary.pojo.Admin;
import com.salary.pojo.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
	//统计
    int countByExample(AdminExample example);
  //删除符合条件的记录
    int deleteByExample(AdminExample example);
  //根据主键删除
    int deleteByPrimaryKey(Integer adminId);
  //插入对象所有字段
    int insert(Admin record);
  //插入对象不为空的字段
    int insertSelective(Admin record);
  //自定义查询条件查询结果集
    List<Admin> selectByExample(AdminExample example);
  //根据主键查询
    Admin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
  //根据主键将对象中不为空的值更新至数据库
    int updateByPrimaryKeySelective(Admin record);
  //根据主键将对象中所有字段的值更新至数据库
    int updateByPrimaryKey(Admin record);
    
}