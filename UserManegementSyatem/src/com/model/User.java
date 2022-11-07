package com.model;

public class User {
	
private	int id;
private String Name;
private String Address;
private long MobileNo;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getMobileNo() {
	return MobileNo;
}
public void setMobileNo(long mobileNo) {
	MobileNo = mobileNo;
}
@Override
public String toString() {
	return "User [id=" + id + ", Name=" + Name + ", Address=" + Address + ", MobileNo=" + MobileNo + "]";
}

}
