package com.studyhelper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@ActiveProfiles("default")
@SpringBootTest(properties = "spring.config.location=classpath:application.yml")
class StudyHelperEc2ApplicationTests {

	@Test
	void contextLoads() {
	}

}
