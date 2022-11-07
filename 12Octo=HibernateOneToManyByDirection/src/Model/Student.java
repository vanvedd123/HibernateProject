package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sName;
	@OneToMany(cascade = CascadeType.ALL ,mappedBy="student")
	private List<Subject>slist=new ArrayList<Subject>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public List<Subject> getSlist() {
		return slist;
	}
	public void setSlist(List<Subject> slist) {
		this.slist = slist;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", slist=" + slist + "]";
	}
	

}
