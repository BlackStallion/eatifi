package com.eAtiFi.ummi.Metadata;

import java.util.List;

public class User {
private List<UserInfo> _UserInfo;
private List<Address> _Addresses;
private List<Families> _Families;
public User() {
	super();
	// TODO Auto-generated constructor stub
}

/*
 * @Override public String toString() { return "User [userInfo=" + _UserInfo +
 * ", addresses=" + _Addresses + ", families=" + _Families + ", getUserInfo()="
 * + getUserInfo() + ", getAddresses()=" + getAddresses() + ", getFamilies()=" +
 * getFamilies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() +
 * ", toString()=" + super.toString() + "]"; }
 */
public List<UserInfo> getUserInfo() {
	return _UserInfo;
}
@Override
public String toString() {
	return "User [_UserInfo=" + _UserInfo + ", _Addresses=" + _Addresses + ", _Families=" + _Families + "]";
}

public void setUserInfo(List<UserInfo> userInfo) {
	this._UserInfo = userInfo;
}
public List<Address> getAddresses() {
	return _Addresses;
}
public void setAddresses(List<Address> addresses) {
	this._Addresses = addresses;
}
/*
 * public List<Families> getFamilies() { return _Families; } public void
 * setFamilies(List<Families> families) { this._Families = families; }
 */
}
