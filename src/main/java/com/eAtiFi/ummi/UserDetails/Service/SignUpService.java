package com.eAtiFi.ummi.UserDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eAtiFi.ummi.UserDetails.Beans.SignUpMetadata;
import com.eAtiFi.ummi.UserDetails.Dao.SignUpDao;

@Service
@Qualifier
public class SignUpService {
	@Autowired 
	private SignUpDao signUpDao;

	public SignUpMetadata addNewUserRegistration(SignUpMetadata signUpMetadata) {
		// TODO Auto-generated method stub
		signUpDao.save(signUpMetadata);
		return signUpMetadata;
	}
	
}
