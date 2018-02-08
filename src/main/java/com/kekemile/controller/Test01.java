package com.kekemile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kekemile.service.impl.UserServiceImpl;

@Controller
public class Test01 {
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/test01")
	public String forwardToTest() {
		System.out.println("--------------------------");
		userService.selectUserById(1);
		System.out.println("--------------------------");
		
		return "Test2";
	}
}
