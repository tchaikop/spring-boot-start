package com.tchaikop.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class HomeController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
	
		System.out.println("hello");
		return "hello";
	}
	
}
