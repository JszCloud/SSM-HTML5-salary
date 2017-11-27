package com.salary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.salary.mapper.StudentMapper;
import com.salary.pojo.Class;
import com.salary.pojo.Course;
import com.salary.pojo.Leave;
import com.salary.pojo.Student;
import com.salary.pojo.StudentExample;

import com.salary.service.StudentService;
import com.salary.pojo.StudentExample.Criteria;

public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;
	/**
	 * 学生用户登录
	 * @return 
	 * */
	@Override
	public List<Student> stulogin(String studentName, String studentPassword) {
				//创建studentExample对象
				StudentExample studentExample=new StudentExample();
				//通过studentExample创建createCriteria对象
				//Criteria createCriteria= studentExample.createCriteria();
				Criteria createCriteria=studentExample.createCriteria();
				//调用数据库查询方法将条件传入studentExample
				createCriteria.andStudentNameLike(studentName);
				createCriteria.andStudentPasswordLike(studentPassword);
				//创建list保存查询结果
				List<Student> list=studentMapper.selectByExample(studentExample);
				return list;
	}
	/**
	 * 学生用户注册
	 * */
	@Override
	public boolean regist(Student student) {
		return false;
	}
	/**
	 * 根据ID查询学生用户信息
	 * */
	@Override
	public Student selectStu(int studentId) {
		Student stuList=studentMapper.selectByPrimaryKey(studentId);
		return stuList;
	}
	/**
	 * 根据学生表中的班级流水号查询班级
	 * */
	@Override
	public Class selectClass(int class_id) {
		return null;
	}
	/**
	 * 根据班级流水号查询课表信息
	 * */
	@Override
	public Course selectCourse(int class_id) {
		return null;
	}
	/**
	 * 填写请假条
	 * */
	@Override
	public boolean fillIn(Leave leave) {
		return false;
	}

}
