package com.salary.service;

import java.util.List;

import com.salary.pojo.Admin;
import com.salary.pojo.Student;
import com.salary.pojo.Teacher;

public interface AdminService {
	/**
	 * 登录
	 * */
	boolean login(String adminName,String adminPaaword);
	boolean login1(String teacherNo,String teacherPaaword);
	boolean login2(String studentNo,String studentPaaword);
	/**
	 * 注册
	 * */
	boolean regist(Admin admin);
	//辅导员用户查询
	List<Admin> adminUser();
	//删除辅导员
	boolean delAdminUser(int adminId);
	//修改辅导员
	boolean editAdminUser(Admin admin);
	//根据id查询辅导员
	Admin selectAdminUser(int adminId);
	//查询学生列表
	List<Student> selectStudent();
	//添加学生
	boolean addStudent(Student student);
	//根据学号删除学生
	boolean delStudent(int studentNo);
	//根据学号修改学生信息
	Student selectStudentId(int studentNo);
	boolean editStudent(Student student);
	//查询教师列表
	List<Teacher> selectTeacher();
	//添加教师
	boolean addTeacher(Teacher teacher);
	//根据教师编号删除
	boolean delTeacher(int teacherNo);
	//根据教师编号修改
	Teacher selectTeacherId(int teacherNo);
	boolean editTeacher(Teacher teacher);
	
	
}
