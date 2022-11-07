package Com.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "Orders")
public class ProductOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_U_id")
	private User user;
	
	@Temporal(TemporalType.DATE)
	private Date Order_date;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(Date order_date) {
		Order_date = order_date;
	}

	@Override
	public String toString() {
		return "ProductOrder [order_id=" + order_id + ", user=" + user + ", Order_date=" + Order_date + "]";
	}
	
    
}
