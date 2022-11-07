package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "C_id")
	private List<Faculty>flist=new ArrayList<Faculty>();
	public List<Faculty> getFlist() {
		return flist;
	}
	public void setFlist(List<Faculty> flist) {
		this.flist = flist;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", flist=" + flist + "]";
	}
	
	
	

}
