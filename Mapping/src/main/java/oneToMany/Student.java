package oneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {   //many
	@Id
	int rollno;
	String name;
	
	@ManyToOne
	Teacher t;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getT() {
		return t;
	}

	public void setT(Teacher t) {
		this.t = t;
	}

	public Student(int rollno, String name, Teacher t) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.t = t;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", t=" + t + "]";
	}
	
	

}
