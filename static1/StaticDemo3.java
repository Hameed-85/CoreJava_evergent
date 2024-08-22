package com.evergent.corejava.static1;
//static method cant access non static method,non static variables
public class StaticDemo3 {
	static String cname="India";
	 String name="Ramesh";
	 public static void myData() 
	{
		 //Cannot make a static reference to the non-static method show() from the type StaticDemo3
		// show();
		 //Cannot make a static reference to the non-static field name
		 //name;
		System.out.println("My Data");
	}
	 public void show() 
	 {
		 System.out.println("Show is non static method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println(cname );
	  myData();
	}

}
