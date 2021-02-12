package com.eAtiFi.ummi.Metadata;

import java.util.List;

public class Families {
	private List<Relations> _Relations;

	public List<Relations> get_Relations() {
		return _Relations;
	}

	public void set_Relations(List<Relations> _Relations) {
		this._Relations = _Relations;
	}

	@Override
	public String toString() {
		return "Families [_Relations=" + _Relations + ", get_Relations()=" + get_Relations() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Families() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
