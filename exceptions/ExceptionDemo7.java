package com.evergent.corejava.exceptions;

public class ExceptionDemo7 {
	String name=null;
	public void myData() throws Exception
	{
		System.out.println("One");
		System.out.println(name.length());
		System.out.println("End");
	}

	public static void main(String[] args) {
		try 
		{
			ExceptionDemo7 ed2=new ExceptionDemo7();
			ed2.myData();
		}
		catch(Exception e) 
		{
			System.out.println("I can HAndle"+e);
		}

	}

}
