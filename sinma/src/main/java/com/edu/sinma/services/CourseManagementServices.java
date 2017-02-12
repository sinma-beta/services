package com.edu.sinma.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sinma.model.Course;

@RestController
public class CourseManagementServices {

	@RequestMapping(value="/course", method=RequestMethod.POST)
	public Course addCourse(){
		Course c = new Course();
		c.setId("123");
		c.setTitle("test");
		c.setDescription("test description");
		return c;
	}
	
	@RequestMapping(value="/course/{id}", method=RequestMethod.GET)
	public String getCourse(@PathVariable String id){
		return "Test Get";
	}
	
	@RequestMapping(value="/course/{id}", method=RequestMethod.PUT)
	public String updateCourse(@PathVariable String id){
		return "Test Get";
	}
	
}
