package com.eAtiFi.ummi.Metadata;

public class ContactNo {
private String _Mobile;
private String _Business;
private String _Others;

public String get_Mobile() {
	return _Mobile;
}
public void set_Mobile(String _Mobile) {
	this._Mobile = _Mobile;
}
public String get_Business() {
	return _Business;
}
public void set_Business(String _Business) {
	this._Business = _Business;
}
public String get_Others() {
	return _Others;
}
public void set_Others(String _Others) {
	this._Others = _Others;
}
@Override
public String toString() {
	return "ContactNo [_Mobile=" + _Mobile + ", _Business=" + _Business + ", _Others=" + _Others + ", get_Mobile()="
			+ get_Mobile() + ", get_Business()=" + get_Business() + ", get_Others()=" + get_Others() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public ContactNo() {
	super();
	// TODO Auto-generated constructor stub
}



}
