package com.edu.sinma.model;

public class ValidationException extends RuntimeException{

	private ServiceDataWrapper<?, ?> serviceDataWrapper;

	public ValidationException(ServiceDataWrapper<?, ?> serviceDataWrapper){
		this.serviceDataWrapper = serviceDataWrapper;
	}

	public ServiceDataWrapper<?, ?> getServiceDataWrapper() {
		return serviceDataWrapper;
	}
	
	
}
