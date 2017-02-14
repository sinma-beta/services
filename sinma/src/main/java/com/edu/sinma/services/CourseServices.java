package com.edu.sinma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sinma.handler.CourseHandler;
import com.edu.sinma.model.Course;
import com.edu.sinma.model.ServiceDataWrapper;

@RestController
public class CourseServices {

	@Autowired
	private CourseHandler courseHandler;
	
	@RequestMapping(value="/course", method=RequestMethod.POST)
	public ServiceDataWrapper<Course, Course> addCourse(@RequestBody ServiceDataWrapper<Course, Course> serviceDataWrapper){
		serviceDataWrapper = courseHandler.create(serviceDataWrapper);
		return serviceDataWrapper;
	}
	
	@RequestMapping(value="/course", method=RequestMethod.PUT)
	public ServiceDataWrapper<Course, Course> updateCourse(@RequestBody ServiceDataWrapper<Course, Course> serviceDataWrapper){
		serviceDataWrapper = courseHandler.update(serviceDataWrapper);
		return serviceDataWrapper;
	}
	
	@RequestMapping(value="/course/{id}", method=RequestMethod.GET)
	public ServiceDataWrapper<Course, Course> getCourse(@PathVariable Integer id){
		ServiceDataWrapper<Course, Course> serviceDataWrapper = new ServiceDataWrapper<Course, Course>();
		serviceDataWrapper = courseHandler.get(id, serviceDataWrapper);
		return serviceDataWrapper;
	}
	
}
