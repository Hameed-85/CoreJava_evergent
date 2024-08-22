package com.evergent.corejava.oops;

public class Person {
	String name="Hameed";
	int age=22;
	String adress="Hyd";
	public void display() {
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Address is:"+adress);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.display();

	}

}
