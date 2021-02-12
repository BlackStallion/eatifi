package com.eAtiFi.ummi.UserDetails.Beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eAtiFi.ummi.Metadata.DataInfo;
import com.eAtiFi.ummi.Metadata.UserInfo;



public class UserDetailsMetadata {
	/*
	 * @Column(nullable =false) private List<DataInfo> _Data = null;
	 * 
	 * @Column(nullable =false) private List<User> _User = null;
	 */
	
	/*
	 * @Id
	 * 
	 * @Column(nullable =false,unique =true,length=64) private String userIdNo;
	 * 
	 * 
	 * 
	 * @Override public String toString() { return "UserDetailsMetadata [userIdNo="
	 * + userIdNo + "]"; }
	 * 
	 * 
	 * 
	 * public String getUserIdNo() { return userIdNo; }
	 * 
	 * 
	 * 
	 * public void setUserIdNo(String userIdNo) { this.userIdNo = userIdNo; }
	 */

	private List<UserInfo> userInfos;

	public List<UserInfo> getUserInfos() {
		return userInfos;
	}

	@Override
	public String toString() {
		return "UserDetailsMetadata [userInfos=" + userInfos + "]";
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}

	public UserDetailsMetadata() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
