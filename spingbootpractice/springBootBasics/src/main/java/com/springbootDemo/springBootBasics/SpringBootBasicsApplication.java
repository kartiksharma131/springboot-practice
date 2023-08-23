package com.springbootDemo.springBootBasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
		//server -> a program running for infinite amount of time
		//it takes user request and returns some response 
		
		/*
		 * spring boot is not a server
		 * spring boot is a framework that contains embedded server and also contains code to start the embedded server
		 * tomcat, jetty are servers
		 * spring boot - an enhancement on top of spring framework
		 * 			feature to autoconfigure 
		 * 			annotations help to reduce the code
		 * 			we can write or create objects using annotations
		 * 
		 * API -> application programming interface
		 * 		  contract betweeen frontend and backend to do some operation
		 * 		  
		 * 		
		 */
	}

}
