package com.edu.sinma.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edu.sinma.dao.CourseDAO;
import com.edu.sinma.model.Course;
import com.edu.sinma.model.ServiceDataWrapper;
import com.edu.sinma.model.ValidationException;
import com.edu.sinma.validator.CourseValidator;

@Component
public class CourseHandler {

	@Autowired
	private CourseValidator courseValidator;
	
	@Autowired
	private CourseDAO courseDAO;
	
	public ServiceDataWrapper<Course,Course> create(ServiceDataWrapper<Course,Course> serviceDataWrapper){
		courseValidator.validateCreate(serviceDataWrapper);
		if(serviceDataWrapper.hasErrors()){
			throw new ValidationException(serviceDataWrapper);
		}
		
		Course course = courseDAO.create(serviceDataWrapper.getRequest());
		serviceDataWrapper.setResponse(course);
		return serviceDataWrapper;
	}
	
	public ServiceDataWrapper<Course,Course> update(ServiceDataWrapper<Course,Course> serviceDataWrapper){
		courseValidator.validateUpdate(serviceDataWrapper);
		Course course = courseDAO.update(serviceDataWrapper.getRequest());
		serviceDataWrapper.setResponse(course);
		return serviceDataWrapper;
	}
	
	public ServiceDataWrapper<Course,Course> get(Integer id, ServiceDataWrapper<Course,Course> serviceDataWrapper){
		courseValidator.validateGet(serviceDataWrapper, id);
		Course course = courseDAO.get(id);
		serviceDataWrapper.setResponse(course);
		return serviceDataWrapper;
	}
	
	
}
