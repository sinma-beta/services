package com.edu.sinma.validator;

import org.hsqldb.lib.StringUtil;
import org.springframework.stereotype.Component;

import com.edu.sinma.model.Course;
import com.edu.sinma.model.ServiceDataWrapper;

@Component
public class CourseValidator {
	
	public void validateCreate(ServiceDataWrapper<Course,Course> serviceDataWrapper){
		Course course = serviceDataWrapper.getRequest();
		if(StringUtil.isEmpty(course.getTitle())){
			serviceDataWrapper.addError("Title is empty");
		}
		
		if(StringUtil.isEmpty(course.getDescription())){
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
