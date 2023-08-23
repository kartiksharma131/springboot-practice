package com.springBootDemoLecture5.springbootAPIdemo;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ImageController {

	//ques -> create an api to get an image
	//		-> input -> size params- length and breadth
	//		-> output should be it should return an image in postman or chrome
	@GetMapping(value="/getImage",produces = org.springframework.http.MediaType.IMAGE_JPEG_VALUE)
	public byte[] displayImage(@RequestParam("id") int id,
							   @RequestParam(value="length",required = false,defaultValue = "300")int length,
							   @RequestParam(value="breadth",required=false,defaultValue = "200") int breadth) {
		
		String url= "https://picsum.photos/id/"+id +"/"+length+"/" +breadth ;
		
		RestTemplate restTemplate = new RestTemplate();
		byte[] imageResponse = restTemplate.getForObject(url, byte[].class);
		return imageResponse;
	}
	
}
