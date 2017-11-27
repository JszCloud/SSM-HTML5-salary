package com.salary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.salary.pojo.Admin;
import com.salary.pojo.Student;
import com.salary.pojo.Teacher;
import com.salary.service.AdminService;

/**
 * 辅导员 controller
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	/* 注解Service */
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/writeSession")
	private ModelAndView writeSession(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		req.getSession(true).invalidate();
		mav.setViewName("admin/admin_login");
		return mav;
	}
	@RequestMapping("/admin_v1")
	private ModelAndView admin_v1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/admin_v1");
		return mav;
	}
	@RequestMapping("/admin_v11")
	private ModelAndView admin_v11() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("err");
		return mav;
	}
	/**
	 * 登录view
	 * 
	 *//*
	@RequestMapping("/login")
	public ModelAndView login(Admin admin, HttpServletRequest request) throws Exception {
		// 创建视图模型对象
		ModelAndView mav = new ModelAndView();
		// 创建su 并赋值，括号中讲页面获取的值传到service login（）方法中
		boolean su = adminService.login(admin.getAdminName(), admin.getAdminPassword());

		// mav.addObject("cs", list);
		// 判断是否在数据库中找到用户
		if (su) {
			// 传值到jsp页面 页面通过${msg}显示
			request.getSession().setAttribute("USER_SESSION_KEY", admin.getAdminName());
			
			mav.addObject("msg", admin.getAdminName());
			System.out.println(Global.USER_SESSION_KEY);
			// 传入view 路径
			mav.setViewName("admin/admin");
			return mav;
		} else {
			// 传入view 路径
			mav.addObject("err", 0);
			mav.setViewName("admin/adminlogin");
			return mav;
		}
	}*/

	/**
	 * 
	 * 注册view
	 * 
	 */
	@RequestMapping("/regist")
	private ModelAndView regist(Admin admin) {
		ModelAndView mav = new ModelAndView();
		adminService.regist(admin);
		mav.setViewName("listCategory");
		return mav;
	}

	/**
	 * 
	 * adminUser 辅导员列表 增加修改 删除
	 * 
	 */
	//查询
	@RequestMapping("/adminUser")
	private ModelAndView adminUser() {
		ModelAndView mav = new ModelAndView();
		List<Admin> adminUser = adminService.adminUser();
		
		mav.addObject("adminUser", adminUser);
		mav.setViewName("/admin/admin_user");
		return mav;
	}
	
	//修改前查询
	@RequestMapping("/selectEdit")
	private ModelAndView selectEdit(Admin admin) {
		ModelAndView mav = new ModelAndView();
		Admin selectEdit=adminService.selectAdminUser(admin.getAdminId());
		mav.addObject("selectEdit", selectEdit);
		mav.setViewName("admin/admin_edit");
		return mav;
	}
	//修改
	@RequestMapping("/editAdminUser")
	private ModelAndView editAdminUser(Admin admin) {
		boolean edit=adminService.editAdminUser(admin);
		System.out.println(edit);
		ModelAndView mav = new ModelAndView("forward:/admin/adminUser");
		if (edit==true) {
			mav.addObject("mess", "修改成功");
			return mav;
		} 
		mav.addObject("mess", "修改失败");
		return mav;
	}
	//添加
	@RequestMapping("/addAdmin")
	private ModelAndView addAdmin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/admin_add");
		return mav;
	}
	@RequestMapping("/addAdminUser")
	private ModelAndView addAdminUser(Admin admin) {
		ModelAndView mav = new ModelAndView("forward:/admin/adminUser");
		adminService.regist(admin);		
		return mav;
	}
	//删除
		@RequestMapping("/delAdminUser")
		private ModelAndView delAdminUser(Admin admin) {
			boolean del=adminService.delAdminUser(admin.getAdminId());
			//转向 辅导员列表查询  ‘/adminUser’
			ModelAndView mav = new ModelAndView("forward:/admin/adminUser");
			//传入del 的值
			mav.addObject("del", del);
			return mav;
		}

	/**
	 * 
	 * teacherUser 教师列表
	 * 
	 */
	@RequestMapping("/teacherUser")
	private ModelAndView teacherUser() {
		ModelAndView mav = new ModelAndView();
		System.out.println("-----------");
		List<Teacher> teacherUser = adminService.selectTeacher();
		mav.addObject("teacherUser", teacherUser);
		mav.setViewName("admin/teacher_user");
		return mav;
	}

	/**
	 * 
	 * studentUser 学生列表
	 * 
	 */
	@RequestMapping("/studentUser")
	private ModelAndView studentUser() {
		ModelAndView mav = new ModelAndView();
		List<Student> studentUser=adminService.selectStudent();
		System.out.println(studentUser);
		mav.addObject("studentUser", studentUser);
		mav.setViewName("admin/student_user");
		return mav;
	}

	/**
	 * 
	 * classList 班级列表
	 * 
	 */
	@RequestMapping("/classList")
	private ModelAndView classList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/class_list");
		return mav;
	}

	/**
	 * 
	 * addClass 添加班级
	 * 
	 */
	@RequestMapping("/addClass")
	private ModelAndView addClass() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/add_class");
		return mav;
	}

	/**
	 * 
	 * 请假列表
	 * 
	 */
	@RequestMapping("/leaveList")
	private ModelAndView leaveList() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/leave_list");
		return mav;
	}

	/**
	 * 
	 * 考勤列表
	 * 
	 */
	@RequestMapping("/addClass1")
	private ModelAndView addClass1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/add_class");
		return mav;
	}
}
