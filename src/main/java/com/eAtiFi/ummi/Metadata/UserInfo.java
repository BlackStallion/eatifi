package com.eAtiFi.ummi.Metadata;

import java.util.List;

public class UserInfo {
 private List<Names> _Names;
 private List<ContactNo> _ContactNos;
 private List<CountryInfo> _CountryInfos;
 private String _EmaidId;
 private String _WorkType;
 private String _Job;
 private String _Dob;
 private String _Gender;
 private String _Income;
 
public List<Names> get_Names() {
	return _Names;
}

public void set_Names(List<Names> _Names) {
	this._Names = _Names;
}

public List<ContactNo> get_ContactNos() {
	return _ContactNos;
}

public void set_ContactNos(List<ContactNo> _ContactNos) {
	this._ContactNos = _ContactNos;
}

public List<CountryInfo> get_CountryInfos() {
	return _CountryInfos;
}

public void set_CountryInfos(List<CountryInfo> _CountryInfos) {
	this._CountryInfos = _CountryInfos;
}

public String get_EmaidId() {
	return _EmaidId;
}

public void set_EmaidId(String _EmaidId) {
	this._EmaidId = _EmaidId;
}

public String get_WorkType() {
	return _WorkType;
}

public void set_WorkType(String _WorkType) {
	this._WorkType = _WorkType;
}

public String get_Job() {
	return _Job;
}

public void set_Job(String _Job) {
	this._Job = _Job;
}

public String get_Dob() {
	return _Dob;
}

public void set_Dob(String _Dob) {
	this._Dob = _Dob;
}

public String get_Gender() {
	return _Gender;
}

public void set_Gender(String _Gender) {
	this._Gender = _Gender;
}

public String get_Income() {
	return _Income;
}

public void set_Income(String _Income) {
	this._Income = _Income;
}

@Override
public String toString() {
	return "UserInfo [_Names=" + _Names + ", _ContactNos=" + _ContactNos + ", _CountryInfos=" + _CountryInfos
			+ ", _EmaidId=" + _EmaidId + ", _WorkType=" + _WorkType + ", _Job=" + _Job + ", _Dob=" + _Dob + ", _Gender="
			+ _Gender + ", _Income=" + _Income + "]";
}

public UserInfo() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
