package com.eAtiFi.ummi.Metadata;

public class CountryInfo {
	private String _PresentCountry;
	private String _NativeCountry;
	private String _IdentityNo;
	private String _PassportNo;
	public String get_PresentCountry() {
		return _PresentCountry;
	}
	public void set_PresentCountry(String _PresentCountry) {
		this._PresentCountry = _PresentCountry;
	}
	public String get_NativeCountry() {
		return _NativeCountry;
	}
	public void set_NativeCountry(String _NativeCountry) {
		this._NativeCountry = _NativeCountry;
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
		return "CountryInfo [_PresentCountry=" + _PresentCountry + ", _NativeCountry=" + _NativeCountry
				+ ", _IdentityNo=" + _IdentityNo + ", _PassportNo=" + _PassportNo + ", get_PresentCountry()="
				+ get_PresentCountry() + ", get_NativeCountry()=" + get_NativeCountry() + ", get_IdentityNo()="
				+ get_IdentityNo() + ", get_PassportNo()=" + get_PassportNo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public CountryInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
