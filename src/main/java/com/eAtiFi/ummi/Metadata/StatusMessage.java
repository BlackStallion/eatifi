package com.eAtiFi.ummi.Metadata;

public class StatusMessage {
	private String _Status;
	private String _Message;
	private String _Created;
	private String _Updated;
	public String get_Status() {
		return _Status;
	}
	public void set_Status(String _Status) {
		this._Status = _Status;
	}
	public String get_message() {
		return _Message;
	}
	public void set_message(String _message) {
		this._Message = _message;
	}
	public String get_Created() {
		return _Created;
	}
	public void set_Created(String _Created) {
		this._Created = _Created;
	}
	public String get_Updated() {
		return _Updated;
	}
	public void set_Updated(String _Updated) {
		this._Updated = _Updated;
	}
	@Override
	public String toString() {
		return "StatusMessage [_Status=" + _Status + ", _message=" + _Message + ", _Created=" + _Created + ", _Updated="
				+ _Updated + ", get_Status()=" + get_Status() + ", get_message()=" + get_message() + ", get_Created()="
				+ get_Created() + ", get_Updated()=" + get_Updated() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public StatusMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
