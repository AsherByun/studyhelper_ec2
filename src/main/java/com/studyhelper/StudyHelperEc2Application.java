package com.studyhelper;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class StudyHelperEc2Application {
	public static String LOCAL_CONFIG = "C:/Users/Owner/eclipse-workspace/config/real-application.yml";
	public static String APPLICATION_LOCATIONS = " spring.config.location= classpath:application.yml";
	public static String DEPLOY_CONFIG = "";

	public static void main(String[] args) {
		makingApplicationLocations();

		new SpringApplicationBuilder(StudyHelperEc2Application.class).properties(APPLICATION_LOCATIONS).run(args);
	}

	public static void makingApplicationLocations() {
		File localFile = new File(LOCAL_CONFIG);
		File deployFile = new File(DEPLOY_CONFIG);

		if (localFile.exists()) {
			APPLICATION_LOCATIONS += ", file:/" + LOCAL_CONFIG;
		}
		if (deployFile.exists()) {
			APPLICATION_LOCATIONS += DEPLOY_CONFIG;
		}
	}

}
