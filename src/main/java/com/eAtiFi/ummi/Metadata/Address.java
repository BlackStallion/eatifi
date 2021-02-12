package com.eAtiFi.ummi.Metadata;

import java.util.List;

public class Address {
private List<AddressType> _Home;
private List<AddressType> _Business;
private List<AddressType> _Other;
public List<AddressType> get_Home() {
	return _Home;
}
public void set_Home(List<AddressType> _Home) {
	this._Home = _Home;
}
public List<AddressType> get_Business() {
	return _Business;
}
public void set_Business(List<AddressType> _Business) {
	this._Business = _Business;
}
public List<AddressType> get_Other() {
	return _Other;
}
public void set_Other(List<AddressType> _Other) {
	this._Other = _Other;
}
@Override
public String toString() {
	return "Address [_Home=" + _Home + ", _Business=" + _Business + ", _Other=" + _Other + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}
