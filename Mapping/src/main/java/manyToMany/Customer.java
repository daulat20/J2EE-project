package manyToMany;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Customer {

	@Id
	int custid;

	String name;
	String city;

	@ManyToMany
	@JoinTable
	List<Bank> bank;

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Bank> getBank() {
		return bank;
	}

	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}

	public Customer() {
	}

	public Customer(int custid, String name, String city, List<Bank> bank) {
		this.custid = custid;
		this.name = name;
		this.city = city;
		this.bank = bank;
	}
}
