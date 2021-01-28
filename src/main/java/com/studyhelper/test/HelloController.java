package com.studyhelper.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${name:이름이없어용용}")
	private String name;
	
	@GetMapping("/hello")
	public String hello() {
		return "안녕하세요 로로로로로";
	}
	@GetMapping("/hellow")
	public String hellow() {
		return "Hellow~~123123123123123"+name;
	}
}
