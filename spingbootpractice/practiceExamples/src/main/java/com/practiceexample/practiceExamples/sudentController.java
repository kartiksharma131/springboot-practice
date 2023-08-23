package com.practiceexample.practiceExamples;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sudentController {
	
	@Autowired
	democonfig obj;

	HashMap<Integer,student> studentHashmap =new HashMap<>();
	private static int count=1;
	
	@PostMapping("/addstudent")
	public student addStudent(@RequestBody student student) {
		student.setRollNo(count++);
		studentHashmap.put(student.getRollNo(), student);
		return student ;
	}
	
	@GetMapping("/getstudent")
	public student getStudent(@RequestParam("rollNo") int rollNo) {
		return studentHashmap.get(rollNo);
	}
	
	@DeleteMapping("/deletestudent")
	public student deleteStudent(@RequestParam("rollno") int rollNo) {
		return studentHashmap.remove(rollNo);
	}
	
	@GetMapping("/getallstudents")
	public List<student> getAllStudents(){
		return studentHashmap.values().stream().collect(Collectors.toList());
	}
	
	@GetMapping("/getconfigmessage")
	public String getConfigmessage() {
		return obj.getconfig();
	}
}
