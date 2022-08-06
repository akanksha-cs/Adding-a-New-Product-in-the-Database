package com.studentInfo;

public class Product {
	private int id;
	private String Pname;
	private int Price;
	public int getPid() {
		return id;
	}
	public void setPid(int Pid) {
		this.id = Pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String Pname) {
		this.Pname = Pname;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}

}
