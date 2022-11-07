package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pName;
	private String pAddress;
	@OneToOne(cascade=CascadeType.ALL)
	private AdharCard aadharCard;
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
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public AdharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AdharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}
	

}