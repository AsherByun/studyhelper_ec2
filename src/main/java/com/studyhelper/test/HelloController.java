package com.studyhelper.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "안녕하세요";
	}
	@GetMapping("/hellow")
	public String hellow() {
		return "Hellow~~";
	}
}
