package Login.Test_Login.Model.Response.ErrorResponse;

import java.io.Serializable;

public class Error implements Serializable {

	private String message;
	private short status;
	
	public Error(String message, short status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public short getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	
	
	
	
}
