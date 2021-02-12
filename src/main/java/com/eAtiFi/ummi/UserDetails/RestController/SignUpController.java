package com.eAtiFi.ummi.UserDetails.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eAtiFi.ummi.UserDetails.Beans.SignUpMetadata;
import com.eAtiFi.ummi.UserDetails.Service.SignUpService;



@RestController
public class SignUpController {
	@Autowired
	private SignUpService signUpServoice;
	@PostMapping(path="/signup" ,consumes="application/json")
	
	public SignUpMetadata addSignUpMetadata(@RequestBody SignUpMetadata signUpMetadata) {
		return signUpServoice.addNewUserRegistration(signUpMetadata);
		
	}
	
	}
