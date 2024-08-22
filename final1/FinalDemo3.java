package com.evergent.corejava.final1;
//final class cant be inherited
final class MyClass
{
	public void myProducts() 
	{
		//cname="Welcome";
		//The final field FinalDemo1.cname cannot be assigned
		System.out.println("All Products");
	}
	}
//The type FinalDemo3 cannot subclass the final class MyClass

public class FinalDemo3 {
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
		FinalDemo3 fd=new FinalDemo3();
		fd.myProducts1();

	}

}
