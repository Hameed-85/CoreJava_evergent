package com.evergent.corejava.final1;
//final method cant be overridden
class MyClass
{
	final public void myProducts() 
	{
		//cname="Welcome";
		//The final field FinalDemo1.cname cannot be assigned
		System.out.println("All Products");
	}
	}

public class FinalDemo2 extends MyClass {
	//final String cname="India";
	public void myProducts1() 
	{
		//Cannot override the final method from MyClass
		//cname="Welcome";
		//The final field FinalDemo1.cname cannot be assigned
		System.out.println("All My Products");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd=new FinalDemo2();
		fd.myProducts1();

	}

}
