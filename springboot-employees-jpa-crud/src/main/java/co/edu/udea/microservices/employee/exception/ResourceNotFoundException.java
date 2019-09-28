package co.edu.udea.microservices.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -8994513709884031406L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
