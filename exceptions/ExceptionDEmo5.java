package com.evergent.corejava.exceptions;

public class ExceptionDEmo5 {
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
	}
	public static void main(String args[]) 
	{
		ExceptionDEmo5 ed2=new ExceptionDEmo5();
		ed2.myData();
		
	}

}
