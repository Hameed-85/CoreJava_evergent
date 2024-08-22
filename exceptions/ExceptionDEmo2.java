package com.evergent.corejava.exceptions;

public class ExceptionDEmo2 {
	//All Execptions are executed while abnormal conditionds only
	//Once any exception are occuring in java code then remain lines of codes are reachable
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
		ExceptionDEmo2 ed2=new ExceptionDEmo2();
		ed2.myData();
		
	}

}
