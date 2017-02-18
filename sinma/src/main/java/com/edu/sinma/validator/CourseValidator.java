package com.edu.sinma.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.edu.sinma.model.Course;
import com.edu.sinma.model.ServiceDataWrapper;

@Component
public class CourseValidator {
	
	public void validateCreate(ServiceDataWrapper<Course,Course> serviceDataWrapper){
		Course course = serviceDataWrapper.getRequest();
		if(StringUtils.isEmpty(course.getTitle())){
			serviceDataWrapper.addError("Title is empty");
		}
		
		if(StringUtils.isEmpty(course.getDescription())){
			serviceDataWrapper.addError("Description is empty");
		}
	}
	
	public void validateGet(ServiceDataWrapper<Course,Course> serviceDataWrapper, Integer id){
		if(id == null){
			serviceDataWrapper.addError("Id is empty");
		}
	}
	public void validateUpdate(ServiceDataWrapper<Course,Course> serviceDataWrapper){
		validateGet(serviceDataWrapper, serviceDataWrapper.getRequest().getId());
		validateCreate(serviceDataWrapper);
	}

}
