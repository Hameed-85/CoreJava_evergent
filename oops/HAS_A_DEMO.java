package com.evergent.corejava.oops;

public class HAS_A_DEMO {
	public void myData() {
		System.out.println("HAS a my data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HAS_A_DEMO has=new HAS_A_DEMO();
		has.myData();
		MyPerson mp=new MyPerson();
		mp.personInfo();

	}

}
