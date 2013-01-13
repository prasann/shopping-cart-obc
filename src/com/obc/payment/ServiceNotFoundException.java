package com.obc.payment;

public class ServiceNotFoundException extends RuntimeException {
	
	public ServiceNotFoundException(String message){
		super(message);
	}
	
}
