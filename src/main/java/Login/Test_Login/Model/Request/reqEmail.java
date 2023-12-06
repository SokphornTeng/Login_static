package Login.Test_Login.Model.Request;

import java.io.Serializable;

import Login.Test_Login.Model.Entity.userEntity;

public class reqEmail implements Serializable {

	private String email;
	private String pass;
	
	public reqEmail(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public userEntity methodRequest() {
		userEntity newData = new userEntity();
		newData.setEmail(this.email);
		newData.setPass(this.pass);
		return newData;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
