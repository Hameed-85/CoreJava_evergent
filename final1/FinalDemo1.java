package com.evergent.corejava.final1;



public class FinalDemo1 {
	final String cname="India";
	public void myData() 
	{
		//cname="Welcome";
		//The final field FinalDemo1.cname cannot be assigned
		System.out.println("cname"+cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo1 fd=new FinalDemo1();
		fd.myData();

	}

}
