package com.springbackend.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//API will return not found status to client

@ResponseStatus(value = HttpStatus.NOT_FOUND)
	
//this exception extends runtime exceptions
//when resource is not found it throw exception
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
//whenever record existing in database restapi throw this exception
