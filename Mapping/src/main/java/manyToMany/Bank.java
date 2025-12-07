package manyToMany;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bid;

	String bname;
	String location;

	@ManyToMany(mappedBy = "bank")
	List<Customer> cust;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Customer> getCust() {
		return cust;
	}

	public void setCust(List<Customer> cust) {
		this.cust = cust;
	}

	public Bank() {
	}

	public Bank(int bid, String bname, String location, List<Customer> cust) {
		this.bid = bid;
		this.bname = bname;
		this.location = location;
		this.cust = cust;
	}
}
