package com.salary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.salary.pojo.Admin;
import com.salary.pojo.Student;
import com.salary.pojo.Teacher;
import com.salary.service.AdminService;
@Controller
@RequestMapping("")
public class LoginController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/loginview")
	private ModelAndView loginview() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/admin_login");
		return mav;
	}
	/**
	 * 登录view
	 * 
	 */
	@RequestMapping("/login")
	public ModelAndView login(Admin admin, HttpServletRequest request) throws Exception {
		// 创建视图模型对象
		ModelAndView mav = new ModelAndView();
		if (admin.getAdminName()!=null && admin.getAdminName()!="") {
			// 创建su 并赋值，括号中讲页面获取的值传到service login（）方法中
			boolean su = adminService.login(admin.getAdminName(), admin.getAdminPassword());

			// mav.addObject("cs", list);
			// 判断是否在数据库中找到用户
			if (su) {
				// 传值到jsp页面 页面通过${msg}显示
				request.getSession().setAttribute("USER_SESSION_KEY", admin.getAdminName());
				
				mav.addObject("msg", admin.getAdminName());
				
				// 传入view 路径
				mav.setViewName("admin/admin");
				return mav;
			} else {
				// 传入view 路径
				mav.addObject("err", 0);
				mav.setViewName("admin/admin_login");
				return mav;
			}
		} else {
			mav.setViewName("admin/admin_login");
			return mav;
		}
		
	}
	@RequestMapping("/loginTeacher")
	private ModelAndView loginTeacher() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("teacher/teacher_login");
		return mav;
	}
	
	@RequestMapping("/loginteacher")
	public ModelAndView loginTeacher1(Teacher teacher, HttpServletRequest request) throws Exception {
		// 创建视图模型对象
		ModelAndView mav = new ModelAndView();
		if (teacher.getTeacherNo()!=null && teacher.getTeacherPassword()!="") {
			// 创建su 并赋值，括号中讲页面获取的值传到service login（）方法中
			boolean su = adminService.login1(teacher.getTeacherNo(), teacher.getTeacherPassword());

			// mav.addObject("cs", list);
			// 判断是否在数据库中找到用户
			if (su) {
				// 传值到jsp页面 页面通过${msg}显示
				request.getSession().setAttribute("USER_SESSION_KEY", teacher.getTeacherNo());
				
				mav.addObject("msg", teacher.getTeacherName());
				
				// 传入view 路径
				mav.setViewName("teacher/teacher");
				return mav;
			} else {
				// 传入view 路径
				mav.addObject("err", 0);
				mav.setViewName("teacher/teacher_login");
				return mav;
			}
		} else {
			mav.setViewName("teacher/teacher_login");
			return mav;
		}
		
	}
	
	
	
	@RequestMapping("/loginStudent")
	private ModelAndView loginStudent() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("student/student_login");
		return mav;
	}
	@RequestMapping("/loginstudent")
	public ModelAndView loginStudent1(Student student, HttpServletRequest request) throws Exception {
		// 创建视图模型对象
		ModelAndView mav = new ModelAndView();
		if (student.getStudentNo()!=null && student.getStudentPassword()!="") {
			// 创建su 并赋值，括号中讲页面获取的值传到service login（）方法中
			boolean su = adminService.login2(student.getStudentNo(), student.getStudentPassword());

			// mav.addObject("cs", list);
			// 判断是否在数据库中找到用户
			if (su) {
				// 传值到jsp页面 页面通过${msg}显示
				request.getSession().setAttribute("USER_SESSION_KEY", student.getStudentNo());
				
				mav.addObject("msg", student.getStudentName());
				
				// 传入view 路径
				mav.setViewName("student/student");
				return mav;
			} else {
				// 传入view 路径
				mav.addObject("err", 0);
				mav.setViewName("student/student_login");
				return mav;
			}
		} else {
			mav.setViewName("student/student_login");
			return mav;
		}
		
	}
}
