package com.studyhelper.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class HelloController {
	@Autowired
	private Environment env;
	@GetMapping("/hello")
	public String hello() {
		return "안녕하세요 로로로로로";
	}
	@GetMapping("/hellow")
	public String hellow() {
		return "Hellow~~123123123123123";
	}
	@GetMapping("/profile")
	public String getProfile() {
		return Arrays.stream(env.getActiveProfiles()).findFirst().orElse("no");
	}
}
