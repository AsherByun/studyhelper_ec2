package com.studyhelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class StudyHelperEc2Application {
	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "file:/C:/Users/Owner/eclipse-workspace/config/real-application.yml,"
			+ "classpath:application.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(StudyHelperEc2Application.class).properties(APPLICATION_LOCATIONS).run(args);
//		SpringApplication.run(StudyHelperEc2Application.class, args);
	}

}
