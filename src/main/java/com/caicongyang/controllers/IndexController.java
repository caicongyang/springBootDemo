package com.caicongyang.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/hello")
	public String hellow() {
		return "hello，Spring Boot ！";
	}

}
