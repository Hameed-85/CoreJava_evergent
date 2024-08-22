package com.evergent.corejava.static1;
//non static method can access  static method, static variables
public class StaticDemo4 {
	static String cname="India";
	 String name="Ramesh";
	 public static void myData() 
	{
		System.out.println("My Data");
	}
	 public void show() 
	 {
		 myData();
		 System.out.println("Show is non static method:"+cname);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println(cname );
	  myData();
	  StaticDemo4 sd4=new StaticDemo4();
	  sd4.show();
	}

}
