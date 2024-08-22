package com.evergent.corejava.javabeans;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int pno;
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	private String pname;
	private double price;
	public ProductBean(int pno,String pname,double price) 
	{
		this.pno=pno;
		this.pname=pname;
		this.price=price;
	}
	

}
