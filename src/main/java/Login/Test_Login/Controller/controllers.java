package Login.Test_Login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Login.Test_Login.Controller.Exception.BadRequestException;
import Login.Test_Login.Model.Entity.userEntity;
import Login.Test_Login.Model.Request.reqEmail;
import Login.Test_Login.Model.Response.loginResponse;
import Login.Test_Login.Services.ServiceAll;

@RestController
@RequestMapping("/api/info")
public class controllers {

	private final ServiceAll serAll;
    @Autowired
	public controllers(ServiceAll serAll) {
		super();
		this.serAll = serAll;
	}
	
    @PostMapping("/login")
    public ResponseEntity<loginResponse> create(@RequestBody reqEmail Ureq) throws Exception{
    	userEntity entity = this.serAll.serviceUser(Ureq);
  
    	return ResponseEntity.ok(loginResponse.methodResponse(entity));
    }
    
    @PostMapping("/signIn")
    public ResponseEntity<loginResponse> myLogin(@RequestBody reqEmail emailReq) throws BadRequestException{
    	userEntity newLogin = this.serAll.serviceLogin(emailReq);
    	return ResponseEntity.ok(loginResponse.methodResponse(newLogin));
    }
	
}
