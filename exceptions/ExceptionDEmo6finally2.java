package com.evergent.corejava.exceptions;

public class ExceptionDEmo6finally2 {
	//we should follow Herirarachy 
	String name="null";
	int k=10;
	public void myData() 
	{
		try 
		{
			System.out.println("One");
			System.out.println(name.length());
			System.out.println(10/k);
			System.out.println("End");
		}
		finally 
		{
			System.out.println("Finalyblock for closong dbconnection");
		}
	}
	public static void main(String args[]) 
	{
		ExceptionDEmo6finally2 ed2=new ExceptionDEmo6finally2();
		ed2.myData();
		
	}

}
