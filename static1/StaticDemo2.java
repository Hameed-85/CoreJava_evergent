package com.evergent.corejava.static1;

public class StaticDemo2 {
	static String cname="India";
	 String name="Ramesh";
	 public static void myData() 
	{
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
