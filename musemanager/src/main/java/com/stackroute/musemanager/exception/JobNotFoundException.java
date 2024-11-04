package com.stackroute.musemanager.exception;
public class JobNotFoundException extends Exception {

	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
 
	public JobNotFoundException() {

	}

	public JobNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "JobNotFoundException [message=" + message + "]";
	}
	
	
}
