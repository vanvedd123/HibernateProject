package Com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String Name;
	private String Ptype;
	private double price;
	@Transient
	@ManyToOne
	@JoinColumn(name = "Card_id")
	private AddToCard Card;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return Name;
	}

	public AddToCard getCard() {
		return Card;
	}

	public void setCard(AddToCard card) {
		Card = card;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPtype() {
		return Ptype;
	}

	public void setPtype(String ptype) {
		Ptype = ptype;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", Name=" + Name + ", Ptype=" + Ptype + ", price=" + price + ", Card=" + Card
				+ "]";
	}

}
