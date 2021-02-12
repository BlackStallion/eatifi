/**
 * 
 */
package com.eAtiFi.ummi.Metadata;

/**
* @author droidmaid
* @author Email : mmaidul.islam@gmail.com 
 * @version Creation time: Feb 8, 2021 2:17:30 PM
 * @Cppyrights 2021 @eAtiFi.com
*/
public class AddressType {
	private String _HouseNo;
	private String _FloorNo;
	private String _StreetNo;
	private String _Address1;
	private String _Address2;
	private String _City;
	private String _State;
	public AddressType() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String _Country;
	public String get_HouseNo() {
		return _HouseNo;
	}
	public void set_HouseNo(String _HouseNo) {
		this._HouseNo = _HouseNo;
	}
	public String get_FLoorNo() {
		return _FloorNo;
	}
	public void set_FLoorNo(String _FLoorNo) {
		this._FloorNo = _FLoorNo;
	}
	public String get_StreetNo() {
		return _StreetNo;
	}
	public void set_StreetNo(String _StreetNo) {
		this._StreetNo = _StreetNo;
	}
	public String get_Address1() {
		return _Address1;
	}
	public void set_Address1(String _Address1) {
		this._Address1 = _Address1;
	}
	public String get_Address2() {
		return _Address2;
	}
	public void set_Address2(String _Address2) {
		this._Address2 = _Address2;
	}
	public String get_City() {
		return _City;
	}
	public void set_City(String _City) {
		this._City = _City;
	}
	public String get_State() {
		return _State;
	}
	public void set_State(String _State) {
		this._State = _State;
	}
	public String get_Country() {
		return _Country;
	}
	public void set_Country(String _Country) {
		this._Country = _Country;
	}
	@Override
	public String toString() {
		return "Address [_HouseNo=" + _HouseNo + ", _FLoorNo=" + _FloorNo + ", _StreetNo=" + _StreetNo + ", _Address1="
				+ _Address1 + ", _Address2=" + _Address2 + ", _City=" + _City + ", _State=" + _State + ", _Country="
				+ _Country + ", get_HouseNo()=" + get_HouseNo() + ", get_FLoorNo()=" + get_FLoorNo() + ", get_StreetNo()="
				+ get_StreetNo() + ", get_Address1()=" + get_Address1() + ", get_Address2()=" + get_Address2()
				+ ", get_City()=" + get_City() + ", get_State()=" + get_State() + ", get_Country()=" + get_Country()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
