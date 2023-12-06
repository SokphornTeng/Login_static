package Login.Test_Login.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Login.Test_Login.Controller.Exception.BadRequestException;

@RestControllerAdvice
public class RestControllerHandler {

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<Error> myHandleError(BadRequestException ex){
		Error myEr = new Error(ex.getMessage());
		return ResponseEntity.status(400).body(myEr);
	}
	
}
