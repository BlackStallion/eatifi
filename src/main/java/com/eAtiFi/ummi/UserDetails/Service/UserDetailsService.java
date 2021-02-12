package com.eAtiFi.ummi.UserDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.eAtiFi.ummi.UserDetails.Beans.UserDetailsMetadata;
import com.eAtiFi.ummi.UserDetails.Dao.UserDetailsDao;

@Service
@Qualifier
public class UserDetailsService {
	@Autowired 
	private UserDetailsDao _UserDetailsDao;

	/*
	 * public SignUpMetadata addNewUserRegistration(SignUpMetadata signUpMetadata) {
	 * // TODO Auto-generated method stub signUpDao.save(signUpMetadata); return
	 * signUpMetadata; }
	 */
	public UserDetailsMetadata addNewUserDeatils(UserDetailsMetadata userDetailsMetadata) {
		// TODO Auto-generated method stub
		_UserDetailsDao.save(userDetailsMetadata);
		return userDetailsMetadata;
	}
	
}
