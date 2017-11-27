package com.salary.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/student")
	private ModelAndView writeSession(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/student/student");
		return mav;
	}
	@RequestMapping("/student_v1")
	private ModelAndView writeSession1(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/student/student_v1");
		return mav;
	}
	
}
