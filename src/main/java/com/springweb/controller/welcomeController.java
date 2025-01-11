package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class welcomeController {

@RequestMapping("/")
	public String greet() {
		System.out.println("WelcomeController.greet()");
		return "/WEB-INF/welcome.jsp";
	}
}