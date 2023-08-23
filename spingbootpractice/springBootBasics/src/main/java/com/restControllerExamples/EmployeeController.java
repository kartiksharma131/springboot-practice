package com.restControllerExamples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	//make an API
	//API consists of -> 
			/* 1) Method   -----GET, POST,PUT,DELETE
			 * 		get-> used to retrieve some response from backend. Get is a safe method
			 * 		put-> used to update details on backend
			 * 		post-> used to save/store some data on backend. post is unsafe -> as it saves data and proper exception handling might not be there and it might impact the code
			 * 		delete-> used to delete some data on the backend
			 * 		//all above are http methods
			 * 2) request
			 * 3) response
			 */
	
			/*
			 * types of API
			 * 1) Rest -> representational state transfer
			 * 		   -> Stateless(no need to maintain the information data for transition from one state to another)
			 * 		   -> less bandwidth required (like for media)
			 * 		   -> formats supported are json,plaintext and xml
			 * 2) SOAP -> simple object access protocol
			 * 		   -> Stateful 
			 * 		   -> more bandwidth 
			 * 		   -> only xml supported
			 * 
			 * 
			 */
	//@GetMapping("/greet")
	@RequestMapping(value="/greetPerson",method=RequestMethod.GET)
	public String greetMsg() {
		return "Hi there everyone";
	}
	
	@RequestMapping(value="/greetPersonpost",method=RequestMethod.POST)
	public String greetMsgPost() {
		return "Hi there everyone from post";
	}
	  
	
	
	
	
}
