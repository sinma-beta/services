package com.edu.sinma.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edu.sinma.dao.CourseDAO;
import com.edu.sinma.model.Course;

@Component
public class CourseHandler {

	@Autowired
	private CourseDAO courseDAO;
	
	public Course create(Course course){
		return courseDAO.create(course);
	}
}
