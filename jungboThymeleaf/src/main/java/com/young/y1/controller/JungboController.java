package com.young.y1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.young.y1.teacher.TeacherServiceImpl;
import com.young.y1.teacher.TeacherVO;

import jakarta.servlet.ServletContext;

@Controller
public class JungboController {
	@Autowired
	private TeacherServiceImpl service;
	
	@Autowired
	private ServletContext servlet;
	
	@RequestMapping("teacherList.do")
	String teacherList(TeacherVO vo , Model model ) {
		model.addAttribute("li",service.teacherList(vo));
		return "teacher/teacherList.html";
	}
	
}