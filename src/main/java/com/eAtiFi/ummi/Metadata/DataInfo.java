package com.eAtiFi.ummi.Metadata;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class DataInfo {

	private String _Type;
	private String _Id;
	private List<StatusMessage> _StatusMessages;
	
	public String get_Type() {
		return _Type;
	}
	public void set_Type(String _Type) {
		this._Type = _Type;
	}
	public String get_Id() {
		return _Id;
	}
	public void set_Id(String _Id) {
		this._Id = _Id;
	}
	public List<StatusMessage> getStatusMessages() {
		return _StatusMessages;
	}
	public void setStatusMessages(List<StatusMessage> statusMessages) {
		this._StatusMessages = statusMessages;
	}
	@Override
	public String toString() {
		return "DataInfo [_Type=" + _Type + ", _Id=" + _Id + ", _StatusMessages=" + _StatusMessages + ", get_Type()="
				+ get_Type() + ", get_Id()=" + get_Id() + ", getStatusMessages()=" + getStatusMessages()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public DataInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
