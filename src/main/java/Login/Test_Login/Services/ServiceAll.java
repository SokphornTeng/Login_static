package Login.Test_Login.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Login.Test_Login.Controller.Exception.BadRequestException;
import Login.Test_Login.Model.Entity.userEntity;
import Login.Test_Login.Model.Request.reqEmail;
import Login.Test_Login.Repository.userRepo;

@Service
public class ServiceAll {

	private final userRepo repoU;
    @Autowired
	public ServiceAll(userRepo repoU) {
		super();
		this.repoU = repoU;
	}
	
	public userEntity serviceUser(reqEmail req) throws Exception {
		userEntity ser = req.methodRequest();
		System.out.print("Hello Sokphorn" + ser);
		
		if(this.repoU.existsByEmail(req.getEmail()))
			throw new Exception();
		
		try {
			System.out.print("Hello Sokphorn" + this.repoU.save(ser));
			return this.repoU.save(ser);
		} catch (Exception e) {
			throw new Exception(e);
		}
	
	}
	
//	Login
	public userEntity serviceLogin(reqEmail req) throws BadRequestException {
		return this.repoU.findByEmail(req.getEmail()).orElseThrow(() -> new BadRequestException("Invalid Email"));
	}
	
}
