package com.evergent.corejava.exceptions;
class InvalidScoreException extends RuntimeException
{
	public InvalidScoreException(String mess) {
		super(mess);
	}
}

public class UserDefinedUncheckedExceptionDemo {
	public static void validateScore(int score)throws InvalidScoreException
	{
		if(score>0 || score<100) 
		{
			throw new InvalidScoreException("Score should be between 0 and 100 ");
		}
		else 
		{
			System.out.println("Valid Score");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			validateScore(200);
		}
		catch(InvalidScoreException e) 
		{
			System.out.println("Exception caught at"+e.getMessage());
			System.out.println(e);
		}

	}

}
