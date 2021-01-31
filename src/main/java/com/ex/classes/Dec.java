package com.ex.classes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class Dec {
	@ExceptionHandler(value = Ev.class)
	public ResponseEntity<Object> exception(Ev exception) {
	return new ResponseEntity<>("The name should not be empty",
	HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler(value = Vnf.class)
	public ResponseEntity<Object> exception(Vnf exception) {
		return new ResponseEntity<>("Data not found", HttpStatus.NOT_FOUND);
		}
	}