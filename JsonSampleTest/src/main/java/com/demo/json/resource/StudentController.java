package com.demo.json.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.json.model.Student;

@RestController
public class StudentController {
	
	List<Student> list=new ArrayList<Student>();
	
	@PostMapping("/saveStudent")
	public String savePerson(@RequestBody Student std) {
		
		list.add(std);
		return "Data Saved With Id : "+std.getSid();
		
	}
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent(){
		return list;
	}

}
