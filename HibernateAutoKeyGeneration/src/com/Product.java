package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pName;
	private double Prize;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public double getPrize() {
		return Prize;
	}
	public void setPrize(double prize) {
		Prize = prize;
	}

	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", Prize=" + Prize + "]";
	}
	

}
