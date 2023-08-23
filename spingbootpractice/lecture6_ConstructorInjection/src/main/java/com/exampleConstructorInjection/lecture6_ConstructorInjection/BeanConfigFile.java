package com.exampleConstructorInjection.lecture6_ConstructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class BeanConfigFile {

	@Bean(value = "beanconfigFile")
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
