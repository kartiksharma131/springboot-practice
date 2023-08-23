package com.springBootDemoLecture5.springbootAPIdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfigFile {
	/* @component -> this annotation is used to define our own class as bean
	 * @bean annotation is used to define beans of the object which are part of source code
	 *
	 * beans are stored as key value pair in ioc container where key is the bean name and value is object reference
	 * component annotation -> default bean name is class name in camel case 
	 */
	@Bean
	@Primary
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
	
	/*
	@Bean
	public RestTemplate getTemplate2(int a , int b) {
		return new RestTemplate();
	}
	*/
}
