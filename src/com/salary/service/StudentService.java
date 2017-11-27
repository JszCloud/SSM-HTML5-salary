package com.salary.service;

import com.salary.pojo.Course;
import com.salary.pojo.Leave;
import com.salary.pojo.Student;

import java.util.List;

import com.salary.pojo.Class;
 
public interface StudentService {
		//学生用户登录
		List<Student> stulogin(String studentName,String studentPassword);
		//学生用户注册
		boolean regist(Student student);
		//根据ID查询学生用户信息
		Student selectStu(int studentId);
		//根据学生表中的班级流水号查询班级
		Class selectClass(int class_id);
		//根据班级流水号查询课表信息
		Course selectCourse(int class_id);
		//填写请假条
		boolean fillIn(Leave leave);
		
}
