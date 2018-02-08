package com.kekemile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test01 {

	@RequestMapping("/test01")
	public String forwardToTest() {

		System.out.println("Success to forward to Test page");
		return "Test2";
	}
}
