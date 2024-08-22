package com.evergent.corejava.hameed.application4;
import java.util.Random;
import java.util.Scanner;

public class EmployeeEvergent {
	String str,str1;
	Scanner sc2=new Scanner(System.in);
	 Random rand = new Random();
	 int randomNumber= rand.nextInt(90) + 10; 
	//static block
	static 
	{
		System.out.println("Glad to welcome you to our office - EVERGENT TECHNOLGIES PVT LIMITED");
	}
	//constructor
	public EmployeeEvergent() 
	{
		System.out.println("You will have back ground verification  ");
	}
	public void EmployeeDet() 
	{
		System.out.println("Enter Your Name:");
		this.str=sc2.nextLine();
		System.out.println("Enter your Designation:");
		this.str1=sc2.nextLine();
		
	}
	//Normal Method
	public void EmployeeInfo() 
	{
		System.out.println();
		System.out.println("Name:"+str);
		System.out.println("Employeeid:ETPL7"+randomNumber);
		System.out.println("Your Designation is:"+str1);
	}
	//final
	public final void officeInfo() 
	{
		System.out.println("Once again welcome to EVERGENT I'm Sushanth ");
		System.out.println("Office timing are 9 hours");
		System.out.println("You'll have 3 months Training");
				System.out.println("1st Month:Core Java Training");
				System.out.println("2nd Month: Web Objects");
			    System.out.println("3rd Month:CCB Training");
		System.out.println("For Core Java You'll be Provided with"
				+ "Expert in java Mr.RAM KUMAR SIR(17 Years of Experience)");
		System.out.println("Wish You All the Best");
		System.out.println("****Thank You****");
	}

}
