package com.exampleConstructorInjection.lecture6_ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FileController {

	@Autowired
	RestTemplate obj;
	
	
	BeanConfigFile beanConfigFile;
	
	//childClass obj;
	
	//syntax for constructor injection
	/*
	 * wHY CONSTRUCTOR INJECTION is better
	 * -> java always create the constructor first then it goes and inject and initialize all the property or fields 
	 * -> so when we try to print/access a normally injected value in constructor it is not injected from app.properties file and hence gives a 0 or null value 
	 */
 	public FileController(BeanConfigFile beanConfig) {
		this.beanConfigFile = beanConfig;
	}
 	
 	/*
 	@Autowired
 	public FileController(childClass obj) {
 		this.obj =obj;
 	}
 	*/
 	
	@GetMapping(value="/getFile", produces = MediaType.APPLICATION_PDF_VALUE)
	public byte[] getFile() {
		
		String url = "https://www.buds.com.ua/images/Lorem_ipsum.pdf";
		byte [] fileResponse = obj.getForObject(url, byte[].class);
		return fileResponse;
	}
	
	@GetMapping(value = "/getImage", produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(@RequestParam("id")int id) {
		String url= "https://picsum.photos/id/"+id;
		byte [] imageResponse= beanConfigFile.getTemplate().getForObject(url, byte[].class); 
		return imageResponse;
	}
}
