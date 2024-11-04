package com.stackroute.accountmanager.exception;

public class UserAlreadyExistsException extends Exception{

	private String message;
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserAlreadyExistsException() {
	}
	
	public UserAlreadyExistsException(final String message){
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserAlreadyExistsException [message=" + message + "]";
	}
	
	
}
