package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
	private int eid;
	private String eName;
	private String address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", address=" + address + "]";
	}
	
}
