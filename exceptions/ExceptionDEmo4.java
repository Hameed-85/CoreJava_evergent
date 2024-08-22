package com.evergent.corejava.exceptions;

public class ExceptionDEmo4 {
	//Normal Flow it wont execute any execptions
	String name="null";
	int k=0;
	public void myData() 
	{
		try 
		{
			System.out.println("One");
			System.out.println(name.length());
			System.out.println(10/k);
			System.out.println("End");
		}
		catch(NullPointerException e) 
		{
			System.out.println("I can Handle :"+e);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("I can handle"+e);
		}
		
	}
	public static void main(String args[]) 
	{
		ExceptionDEmo4 ed2=new ExceptionDEmo4();
		ed2.myData();
		
	}

}
