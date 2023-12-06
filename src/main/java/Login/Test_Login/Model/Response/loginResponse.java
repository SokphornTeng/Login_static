package Login.Test_Login.Model.Response;

import java.io.Serializable;

import Login.Test_Login.Model.Entity.userEntity;

public class loginResponse implements Serializable {

	private Long id;
	private String email;
	private String pass;
	
	public loginResponse(Long id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}
	
	public static loginResponse methodResponse(userEntity newUser) {
		return new loginResponse(newUser.getId(), newUser.getEmail(), newUser.getPass());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
