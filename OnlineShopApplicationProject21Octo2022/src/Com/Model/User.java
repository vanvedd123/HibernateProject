package Com.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int User_Id;
	@JoinColumn(name = "UserName")
	private String First_Name;
	@Transient
	private String Last_Name;
	
	private long Mobile_Number;
	
	private String Email_id;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "User_Card_id")
	private AddToCard Card;
	@Transient
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "User_product_id")
	List<Product>product_list=new ArrayList<Product>();
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public long getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(long mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public AddToCard getCard() {
		return Card;
	}
	public void setCard(AddToCard card) {
		Card = card;
	}
	public List<Product> getProduct_list() {
		return product_list;
	}
	public void setProduct_list(List<Product> product_list) {
		this.product_list = product_list;
	}
	@Override
	public String toString() {
		return "User [User_Id=" + User_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Mobile_Number=" + Mobile_Number + ", Email_id=" + Email_id + ", Card=" + Card + ", product_list="
				+ product_list + "]";
	}
	
	
}
