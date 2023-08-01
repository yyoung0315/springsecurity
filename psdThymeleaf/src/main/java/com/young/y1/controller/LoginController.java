package com.young.y1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
		
	
	   @RequestMapping("/index.do")
	   String index() {
	      return "index.html";   
	   }
		
	   
	   @RequestMapping("/login.do")
	   String loginForm() {
	      return "loginForm.html";   
	   }
	   
	   @RequestMapping("/loginSuccess.do")
		String loginSuccess() {		
			return "loginSuccess.html";		
		}
					
		@RequestMapping("/accessDenied.do")
		String accessDenied() {
			
			return "accessDenied.html";
			
		}	
}