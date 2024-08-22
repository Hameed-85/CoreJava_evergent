package com.evergent.corejava.exceptions;

public class StackOverflowErrorExample16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			recursiveMethod();
		}
		catch(StackOverflowError e) 
		{
			System.out.println("StackOverFlowError"+e.getMessage());
		}
		

	}
	public static void recursiveMethod() 
	{
		recursiveMethod();
	}

}
