package com.practiceexample.practiceExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class GetImage {

	//@Autowired
	//beanconfigfile obj;
	
	@Autowired
	RestTemplate obj;
	
	
	
	@GetMapping(value="/getImage",produces = org.springframework.http.MediaType.IMAGE_JPEG_VALUE)
	public byte[] displayImage(@RequestParam("id") int id,
							   @RequestParam(value="length",required = false,defaultValue = "300")int length,
							   @RequestParam(value="breadth",required=false,defaultValue = "200") int breadth) {
		
		String url= "https://picsum.photos/id/"+id +"/"+length+"/" +breadth ;
		
		//RestTemplate restTemplate = new RestTemplate();
		//byte[] imageResponse = obj.getTemplate().getForObject(url, byte[].class);   used when we are using the function we defined as a bean
		byte[] imageResponse = obj.getForObject(url, byte[].class);   // used when we are using the existing source code method itself as a bean
		return imageResponse;
	}
}
