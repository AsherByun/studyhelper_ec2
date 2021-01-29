package com.studyhelper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("tester")
@SpringBootTest(properties = "spring.config.location="
		+ "file:/C:/Users/Owner/eclipse-workspace/config/real-application.yml," + "classpath:application.yml")
class StudyHelperEc2ApplicationTests {

	@Test
	void contextLoads() {
	}

}
