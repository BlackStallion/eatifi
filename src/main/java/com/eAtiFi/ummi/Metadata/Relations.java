package com.eAtiFi.ummi.Metadata;

import java.util.List;

public class Relations {
 private List<Names> Names;
 private List<ContactNo> _ContactNos;
 private String _DOB;
 private String _Gender;
 private String _IdentityNo;
 private String _PassportNo;
public List<Names> getNames() {
	return Names;
}
public void setNames(List<Names> names) {
	Names = names;
}
public List<ContactNo> get_ContactNos() {
	return _ContactNos;
}
public void set_ContactNos(List<ContactNo> _ContactNos) {
	this._ContactNos = _ContactNos;
}
public String get_DOB() {
	return _DOB;
}
public void set_DOB(String _DOB) {
	this._DOB = _DOB;
}
public String get_Gender() {
	return _Gender;
}
public void set_Gender(String _Gender) {
	this._Gender = _Gender;
}
public String get_IdentityNo() {
	return _IdentityNo;
}
public void set_IdentityNo(String _IdentityNo) {
	this._IdentityNo = _IdentityNo;
}
public String get_PassportNo() {
	return _PassportNo;
}
public void set_PassportNo(String _PassportNo) {
	this._PassportNo = _PassportNo;
}
@Override
public String toString() {
	return "Relations [Names=" + Names + ", _ContactNos=" + _ContactNos + ", _DOB=" + _DOB + ", _Gender=" + _Gender
			+ ", _IdentityNo=" + _IdentityNo + ", _PassportNo=" + _PassportNo + ", getNames()=" + getNames()
			+ ", get_ContactNos()=" + get_ContactNos() + ", get_DOB()=" + get_DOB() + ", get_Gender()=" + get_Gender()
			+ ", get_IdentityNo()=" + get_IdentityNo() + ", get_PassportNo()=" + get_PassportNo() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public Relations() {
	super();
	// TODO Auto-generated constructor stub
}
 

}
