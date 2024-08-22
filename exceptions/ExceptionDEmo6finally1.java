package com.evergent.corejava.exceptions;

public class ExceptionDEmo6finally1 {
	//we should follow Herirarachy 
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
		catch(Exception e) 
		{
			System.out.println("I can handle  "+e);
		}
		finally 
		{
			System.out.println("Finalyblock for closong dbconnection");
		}
	}
	public static void main(String args[]) 
	{
		ExceptionDEmo6finally1 ed2=new ExceptionDEmo6finally1();
		ed2.myData();
		
	}

}
