package com.evergent.corejava.immutable;

public class MyPerson {

	public static void main(String[] args) {
		PersonImmutable p1=new PersonImmutable("Hameed", 22);
		System.out.println("Name is :"+p1.Myname());
		System.out.println("Age is:"+p1.Myage());
		

	}

}
