package com.evergent.corejava.exceptions;
class AgeNotSupportException extends Exception
{
	
	public AgeNotSupportException(String mess) 
	{
		System.out.println(6);
		System.out.println("Age is "+mess);
		System.out.println(10);
	}
	}

public class AgeImple {
	int age=10;
	public void ag()throws AgeNotSupportException
	{
		System.out.println(4);
		if(age<18) 
		{
			System.out.println(5);
			throw new AgeNotSupportException("Small Not eligible to vote");
		}
		else 
		{
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		try 
		{
			System.out.println(1);
			AgeImple a=new AgeImple();
			System.out.println(2);
			a.ag();
			System.out.println(3);
		}
		catch(Exception e) 
		{
			
		    System.out.println(7);
			System.out.println("Handled "+e);
		}

	}

}
