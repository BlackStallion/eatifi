package com.eAtiFi.ummi.Metadata;

public class Names {

private String _FirstName;
private String _MiddleName;
private String _LastName;
public String get_FirstName() {
	return _FirstName;
}
public void set_FirstName(String _FirstName) {
	this._FirstName = _FirstName;
}
public String get_MiddleName() {
	return _MiddleName;
}
public void set_MiddleName(String _MiddleName) {
	this._MiddleName = _MiddleName;
}
public String get_LastName() {
	return _LastName;
}
public void set_LastName(String _LastName) {
	this._LastName = _LastName;
}
@Override
public String toString() {
	return "Names [_FirstName=" + _FirstName + ", _MiddleName=" + _MiddleName + ", _LastName=" + _LastName
			+ ", get_FirstName()=" + get_FirstName() + ", get_MiddleName()=" + get_MiddleName() + ", get_LastName()="
			+ get_LastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
public Names() {
	super();
	// TODO Auto-generated constructor stub
}



}
