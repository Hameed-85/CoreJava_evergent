package com.evergent.corejava.exceptions;
class InvalidAgeException extends Exception
{
  public InvalidAgeException(String message) 
  {
	super(message);  
  }	
}

public class UserDefinedExceptionDemo {
	
	public static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18) 
		{
	     throw new InvalidAgeException("Age must be over 18");
		}
		else 
		{
			System.out.println("Acees granted you are old enough");
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			UserDefinedExceptionDemo ude=new UserDefinedExceptionDemo();
			ude.checkAge(16);
			
		}
		catch(InvalidAgeException e) 
		{
			System.out.println("Caought the exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling execption");

	}

}
