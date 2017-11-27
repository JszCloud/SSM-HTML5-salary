package com.salary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	
	@RequestMapping("/teacher")
	private ModelAndView writeSession(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("teacher/teacher");
		return mav;
	}
	@RequestMapping("/teacher_v1")
	private ModelAndView writeSession1(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/teacher/teacher_v1");
		return mav;
	}
}
