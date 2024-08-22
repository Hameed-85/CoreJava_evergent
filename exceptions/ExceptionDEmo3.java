package com.evergent.corejava.exceptions;

public class ExceptionDEmo3 {
	//Normal Flow it wont execute any execptions
	String name="null";
	public void myData() 
	{
		try 
		{
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) 
		{
			System.out.println("I can Handle :"+e);
		}
	}
	public static void main(String args[]) 
	{
		ExceptionDEmo3 ed2=new ExceptionDEmo3();
		ed2.myData();
		
	}

}
