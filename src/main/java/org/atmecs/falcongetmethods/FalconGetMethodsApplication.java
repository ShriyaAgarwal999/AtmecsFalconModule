package org.atmecs.falcongetmethods;

import org.atmecs.falcongetmethods.properties.TestReportProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TestReportProperties.class)
public class FalconGetMethodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FalconGetMethodsApplication.class, args);
	}

}
