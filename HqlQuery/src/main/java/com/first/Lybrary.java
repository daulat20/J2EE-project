package com.first;
import java.sql.Date;

public class Lybrary {
	
	String bookid;
	String bookname;
	float bookprice;
	String Author;
	Date publishdate;
	
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public Lybrary(String bookid, String bookname, float bookprice, String author, Date publishdate) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
		Author = author;
		this.publishdate = publishdate;
	}
	public Lybrary() {
		
	}
	@Override
	public String toString() {
		return "Lybrary [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + ", Author="
				+ Author + ", publishdate=" + publishdate + "]";
	}
	
	

}
