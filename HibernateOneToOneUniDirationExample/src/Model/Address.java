package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String City;
	
	private String Dist;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getDist() {
		return Dist;
	}

	public void setDist(String dist) {
		Dist = dist;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", City=" + City + ", Dist=" + Dist + "]";
	}
	

}
