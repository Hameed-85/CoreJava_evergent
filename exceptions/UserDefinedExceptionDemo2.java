package com.evergent.corejava.exceptions;
class InSufiicientFunds extends Exception
{
	public InSufiicientFunds(String mess) 
	{
		super(mess);
	}
 	
}

public class UserDefinedExceptionDemo2 {
	 
	public static void withDraw(double amount) throws InSufiicientFunds
	{
		double bal=500.0;
		if(amount>bal) 
		{
	     throw new InSufiicientFunds("Insufficient Funds for withdraw");
		}
		else 
		{
			System.out.println("withdraw Succesful");
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//UserDefinedExceptionDemo2 ude=new UserDefinedExceptionDemo2();
			withDraw(2000);
			
		}
		catch(InSufiicientFunds e)
		{
			System.out.println("Caought the exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling execption");

	}

}
