package com.evergent.corejava.javabeans;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private int eno;
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String sname;
	private String address;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student no"+eno+" Student name "+sname+" Student Adress"+address;
	}

}