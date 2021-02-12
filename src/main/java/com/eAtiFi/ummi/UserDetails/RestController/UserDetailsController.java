package com.eAtiFi.ummi.UserDetails.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eAtiFi.ummi.UserDetails.Beans.UserDetailsMetadata;
import com.eAtiFi.ummi.UserDetails.Service.UserDetailsService;

@RestController
public class UserDetailsController {
	@Autowired
	private UserDetailsService userDeatilsService;
	@PostMapping(path="/addUserDetails" ,consumes="application/json")

	/**
	 * @param _UserDeatilsMetadata
	 * @return
	 */
	private UserDetailsMetadata addNewUserRegistrationData(@RequestBody  UserDetailsMetadata _UserDeatilsMetadata) {
		// TODO Auto-generated method stub
		return userDeatilsService.addNewUserDeatils(_UserDeatilsMetadata);
	}
	
	}
