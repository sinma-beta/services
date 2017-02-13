package com.edu.sinma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sinma.dao.CourseDAO;
import com.edu.sinma.handler.CourseHandler;
import com.edu.sinma.model.Course;

@RestController
public class CourseServices {

	@Autowired
	private CourseHandler courseHandler;
	
	@RequestMapping(value="/course", method=RequestMethod.POST)
	public Course addCourse(@RequestBody Course course){
		return courseHandler.create(course);
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
