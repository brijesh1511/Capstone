package com.stackroute.musemanager.exception;

public class JobAlreadyExistsException extends Exception {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JobAlreadyExistsException() {
	}

	public JobAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "JobAlreadyExistsException [message=" + message + "]";
	}

}
