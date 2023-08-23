package com.practiceexample.practiceExamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class beanconfigfile {

	@Bean
	public RestTemplate getTemplate() {
		System.out.println("rest template returned");
		return new RestTemplate();
	}
}
