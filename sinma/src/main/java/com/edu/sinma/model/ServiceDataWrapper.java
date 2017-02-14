package com.edu.sinma.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ServiceDataWrapper<REQ, RES> {

	private REQ request;
	
	private RES response;

	private List<String> errors = new ArrayList<String>();
	
	public REQ getRequest() {
		return request;
	}

	public void setRequest(REQ request) {
		this.request = request;
	}

	public RES getResponse() {
		return response;
	}

	public void setResponse(RES response) {
		this.response = response;
	}

	public void addError(String errorMessage) {
		errors.add(errorMessage);
	}
	
	public boolean hasErrors(){
		return !errors.isEmpty();
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	
	
	
	
}
