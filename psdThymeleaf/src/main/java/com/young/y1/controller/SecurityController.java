package com.young.y1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	   
	   @RequestMapping("/guestbook/guestbookList.do")
	   String guestbookList() {
	      return "index.html";   
	   }
	   
	   @RequestMapping("/manager/managerList.do")
	   String managerList() {
	      return "success.html";   
	   }
	   
	   @RequestMapping("/admin/adminList.do")
	   String adminList() {
	      return "success.html";   
	   }
	   
	   @RequestMapping("/everyone/everyone.do")
	   String everyone() {
	      return "success.html";   
	   }

}