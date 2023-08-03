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
	
	
	@RequestMapping("index.do")
	void index() {}
	
	
	@RequestMapping("teacherList.do")
	String teacherList(TeacherVO vo , Model model ) {
		model.addAttribute("li",service.teacherList(vo));
		return "teacher/teacherList.html";
	}
	
	@RequestMapping("memberForm.do")
	String memberForm() {
		return "/form/memberForm.html";
	}
	
	@RequestMapping("memberInsert.do")
	String memberInsert(TeacherVO vo) {
		
		service.memberInsert(vo);
		return "index.html";
	}
	
	@RequestMapping("memberList.do")
	String memberList(TeacherVO vo , Model model ) {
		model.addAttribute("li",service.memberList(vo));
		return "member/memberList.html";
	}
	
	@RequestMapping("teacherMoney.do")
	String teacherMoney(TeacherVO vo , Model model ) {
		model.addAttribute("li",service.teacherMoney(vo));
		return "teacher/teacherMoney.html";
	}
}