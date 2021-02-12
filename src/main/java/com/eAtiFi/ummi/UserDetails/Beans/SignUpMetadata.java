package com.eAtiFi.ummi.UserDetails.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SignUpMetadata {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	Long Id;
	@Column(nullable =false,length=64)
	String usrFstName;
	@Column(nullable =false,length=64)
	String usrMdlName;
	@Column(nullable =false,length=64)
	String usrLstName;
	@Column(nullable =false,unique =true,length=64)
	String userEmailId;
	@Column(nullable =false,length=64)
	String usrCountry;
	@Column(nullable =false,unique =true,length=64)
	int usrMobile;
	@Id
	@Column(nullable =false,unique =true,length=64)
	String userIdNo;
	
	public SignUpMetadata( String usrFstName, String usrMdlName, String usrLstName, String userEmailId,
			String usrCountry, int usrMobile, String userIdNo) {
		super();
//		Id = id;
		this.usrFstName = usrFstName;
		this.usrMdlName = usrMdlName;
		this.usrLstName = usrLstName;
		this.userEmailId = userEmailId;
		this.usrCountry = usrCountry;
		this.usrMobile = usrMobile;
		this.userIdNo = userIdNo;
	}
	public SignUpMetadata() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * public Long getId() { return Id; } public void setId(Long id) { Id = id; }
	 */
	public String getUsrFstName() {
		return usrFstName;
	}
	public void setUsrFstName(String usrFstName) {
		this.usrFstName = usrFstName;
	}
	public String getUsrMdlName() {
		return usrMdlName;
	}
	public void setUsrMdlName(String usrMdlName) {
		this.usrMdlName = usrMdlName;
	}
	public String getUsrLstName() {
		return usrLstName;
	}
	public void setUsrLstName(String usrLstName) {
		this.usrLstName = usrLstName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUsrCountry() {
		return usrCountry;
	}
	public void setUsrCountry(String usrCountry) {
		this.usrCountry = usrCountry;
	}
	public int getUsrMobile() {
		return usrMobile;
	}
	public void setUsrMobile(int usrMobile) {
		this.usrMobile = usrMobile;
	}
	public String getUserIdNo() {
		return userIdNo;
	}
	public void setUserIdNo(String userIdNo) {
		this.userIdNo = userIdNo;
	}
	/*
	 * @Override public String toString() { return "SignUpMetadata [Id=" + Id +
	 * ", usrFstName=" + usrFstName + ", usrMdlName=" + usrMdlName + ", usrLstName="
	 * + usrLstName + ", userEmailId=" + userEmailId + ", usrCountry=" + usrCountry
	 * + ", usrMobile=" + usrMobile + ", userIdNo=" + userIdNo + "]"; }
	 */
	@Override
	public String toString() {
		return "SignUpMetadata [usrFstName=" + usrFstName + ", usrMdlName=" + usrMdlName + ", usrLstName=" + usrLstName
				+ ", userEmailId=" + userEmailId + ", usrCountry=" + usrCountry + ", usrMobile=" + usrMobile
				+ ", userIdNo=" + userIdNo + "]";
	}
	
	
}
