package com.salary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salary.mapper.AdminMapper;
import com.salary.mapper.StudentMapper;
import com.salary.mapper.TeacherMapper;
import com.salary.pojo.Admin;
import com.salary.pojo.AdminExample;
import com.salary.pojo.TeacherExample;
import com.salary.pojo.AdminExample.Criteria;

import com.salary.pojo.Student;
import com.salary.pojo.StudentExample;
import com.salary.pojo.Teacher;

import com.salary.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminMapper;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	TeacherMapper teacherMapper;
	/**
	 * 登录
	 * */

	@Override
	public boolean login(String adminName, String adminPaaword) {
		//创建adminExample对象
		AdminExample adminExample=new AdminExample();
		//通过adminExample创建createCriteria对象
		Criteria createCriteria= adminExample.createCriteria();
		//调用数据库查询方法将条件传入adminExample
		createCriteria.andAdminNameLike(adminName);
		createCriteria.andAdminPasswordLike(adminPaaword);
		//创建list保存查询结果
		List<Admin> list=adminMapper.selectByExample(adminExample);
		if (list.size()!=0) {
			
			return true;
		}else {
			return false;
		}
		
		
	}
	/**
	 * 注册
	 * */
	@Override
	public boolean regist(Admin admin) {
		int num=adminMapper.insert(admin);
		if (num!=0) {
			return true;
		}
		return false; 
	}
	/**
	 * 辅导员用户查询
	 * */
	@Override
	public List<Admin> adminUser() {
		AdminExample adminExample=new AdminExample();
		return adminMapper.selectByExample(adminExample);
	}
	//删除辅导员员用户
	@Override
	public boolean delAdminUser(int adminId) {
		int del=adminMapper.deleteByPrimaryKey(adminId);
		if (del!=0) {
			return true;
		}
		return false;
	}
	//修改辅导员用户
	@Override
	public boolean editAdminUser(Admin admin) {
		/*AdminExample adminExample=new AdminExample();
		Criteria createCriteria= adminExample.createCriteria();
		createCriteria.andAdminPasswordEqualTo(admin.getAdminPassword());
		createCriteria.andAdminNameEqualTo(admin.getAdminName());*/
		int edit=adminMapper.updateByPrimaryKey(admin);
		if (edit!=0) {
			return true;
		}
		
		return false;
	}
	//根据id查询辅导员用户信息
	@Override
	public Admin selectAdminUser(int adminId) {
		
		return adminMapper.selectByPrimaryKey(adminId);
	}
	//查询学生信息
	@Override
	public List<Student> selectStudent() {
		StudentExample studentExample=new StudentExample();
		System.out.println(studentExample+"------");
		return studentMapper.selectByExample(studentExample);
	}
	//添加学生信息
	@Override
	public boolean addStudent(Student student) {
		int num=studentMapper.insert(student);
		if (num!=0) {
			return true;
		}
		return false;
	}
	//删除学生信息
	@Override
	public boolean delStudent(int studentNo) {
		int num=studentMapper.deleteByPrimaryKey(studentNo);
		if (num!=0) {
			return true;
		}
		return false;
	}
	//修改学生信息
	@Override
	public Student selectStudentId(int studentNo) {
		return studentMapper.selectByPrimaryKey(studentNo);
	}
	@Override
	public boolean editStudent(Student student) {
		int num=studentMapper.updateByPrimaryKey(student);
		if (num!=0) {
			return true;
		}
		return false;
	}
	
	//查询教师信息
	@Override
	public List<Teacher> selectTeacher() {
		TeacherExample teacherExample=new TeacherExample();
		return teacherMapper.selectByExample(teacherExample);
	}
	//添加教师信息
	@Override
	public boolean addTeacher(Teacher teacher) {
		int num=teacherMapper.insert(teacher);
		if (num!=0) {
			return true;
		}
		return false;
	}
	//删除教师信息
	@Override
	public boolean delTeacher(int teacherNo) {
		int num=teacherMapper.deleteByPrimaryKey(teacherNo);
		if (num!=0) {
			return true;
		}
		return false;
	}
	//修改教师信息
	@Override
	public Teacher selectTeacherId(int teacherNo) {
		
		return teacherMapper.selectByPrimaryKey(teacherNo);
	}
	@Override
	public boolean editTeacher(Teacher teacher) {
		int num=teacherMapper.updateByPrimaryKey(teacher);
		if (num!=0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean login1(String teacherNo, String teacherPaaword) {
		//创建adminExample对象
				TeacherExample teacherExample=new TeacherExample();
				//通过adminExample创建createCriteria对象
				com.salary.pojo.TeacherExample.Criteria createCriteria= teacherExample.createCriteria();
				//调用数据库查询方法将条件传入adminExample
				createCriteria.andTeacherNoLike(teacherNo);
				createCriteria.andTeacherPasswordLike(teacherPaaword);
				//创建list保存查询结果
				List<Teacher> list=teacherMapper.selectByExample(teacherExample);
				if (list.size()!=0) {
					
					return true;
				}else {
					return false;
				}
	}
	@Override
	public boolean login2(String studentNo, String studentPaaword) {
		StudentExample studentExample=new StudentExample();
		//通过adminExample创建createCriteria对象
		com.salary.pojo.StudentExample.Criteria createCriteria=studentExample.createCriteria();
		//调用数据库查询方法将条件传入adminExample
		createCriteria.andStudentNoLike(studentNo);
		createCriteria.andStudentPasswordLike(studentPaaword);
		//创建list保存查询结果
		List<Student> list=studentMapper.selectByExample(studentExample);
		if (list.size()!=0) {
			
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
