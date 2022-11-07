package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sub_id;
	private String sub_Name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stu_sub_id")
	private Student student;
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getSub_Name() {
		return sub_Name;
	}
	public void setSub_Name(String sub_Name) {
		this.sub_Name = sub_Name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", sub_Name=" + sub_Name + "]";
	}
	

}
