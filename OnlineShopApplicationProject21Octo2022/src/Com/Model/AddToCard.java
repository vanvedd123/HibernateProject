package Com.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "Card")
public class AddToCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int card_id;
	
	@Temporal(TemporalType.DATE)
	private Date Purchase_Date;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Card_u_id")
	private User user;

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public Date getPurchase_Date() {
		return Purchase_Date;
	}

	public void setPurchase_Date(Date purchase_Date) {
		Purchase_Date = purchase_Date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "AddToCard [card_id=" + card_id + ", Purchase_Date=" + Purchase_Date + ", user=" + user + "]";
	}
	

}
