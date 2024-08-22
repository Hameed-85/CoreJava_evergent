package com.evergent.corejava.static1;
// static block is intialized first after loading of class 
public class StaticDemo5 {
	static String cname="India";
	 String name="Ramesh";
	 public static void myData() 
	{
		System.out.println("My Data");
	}
	 static 
	 {
		 System.out.println("Welcome to inbuilt Static block");
	 }
	 public void show() 
	 {
		 System.out.println("Show is non static method:"+cname);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println(cname );
	  myData();
	  StaticDemo5 sd4=new StaticDemo5();
	  sd4.show();
	}

}
