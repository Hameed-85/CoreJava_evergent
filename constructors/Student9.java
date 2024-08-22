package com.evergent.corejava.constructors;

public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	public Student9(Student9 s) 
	{
		this.name=s.name;
		this.age=s.age;
	}
	public void displayDetails() 
	{
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student9 st1=new  Student9("Bhanu",20);
     Student9 st2=new Student9(st1);
     st1.displayDetails();
     st2.displayDetails();
	}

}
