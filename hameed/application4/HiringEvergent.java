package com.evergent.corejava.hameed.application4;
import java.util.*;

import com.evergent.corejava.constructors.Employee3;
//
public class HiringEvergent extends RegistrationDetails implements TestPattern {
	Scanner sc1=new Scanner(System.in);
	//abstract method overriding
	public void cgpa(double cgp) 
	{
		System.out.println("Your cgpa is:"+cgp);
	}
	public void aptitudeTest() 
	{
		System.out.println("Tanya from Evergent invites you to take"
				+ " Batch-1-IIIT Basara_Online Drive_24 July2024_Batch-1");
		System.out.println("Enter 1 to take Aptitude test:");
		if(sc1.nextInt()==1) 
		{
			System.out.println("Welcome to Aptitude test");
			System.out.println("Q:If 9 monkeys eat 9 Bananas in 9 minutes then How many"
					+ " Monkeys will eat 45 bananas in 45 Minutes?");
			System.out.println("Options");
			System.out.println("1:9 monkeys");
			System.out.println("2:10 monkeys");
			System.out.println("3:45 monkeys");
			System.out.println("4:20 monkeys");
			if(sc1.nextInt()==1) 
			{
				System.out.println("You entered correct answer ");
				System.out.println();
				System.out.println("Congratulations You've Cleared Aptitude Round ");
				System.out.println("All the Best for Technical Test");
			}
			else 
			{
				System.out.println("You entered wrong answer ");
				System.out.println("Thank you for Exploring We'll Contact you if any openings available");
			}
			
		}
		
		
	}
	public void technicalTest() 
	{
		System.out.println("Enter 1 to take Technical test:");
		if(sc1.nextInt()==1) 
		{
			System.out.println("Welcome to Technical test");
			System.out.println("Q:Which of these following is correct about String class in java?");
			System.out.println("Options");
			System.out.println("1:It is Immutable");
			System.out.println("2:It is Final Class");
			System.out.println("3:Methods of this Class are non-Synchronized");
			System.out.println("4:All of the above");
			if(sc1.nextInt()==4) 
			{
				System.out.println("You entered correct answer ");
				System.out.println();
				System.out.println("Congratulations You've Cleared Technical test Round ");
				System.out.println("All the Best for Technical Interview in Office");
			}
			else 
			{
				System.out.println("You entered wrong answer ");
				System.out.println("Thank you for Exploring We'll Contact you if any openings available");
			}
			
		}
		
		
	}
	public void technicalInterview() 
	{
		System.out.println("Dear Candidate,\r\n"
				+ "\r\n"
				+ "Greetings from Evergent Technologies!\r\n"
				+ "Congratulations on reaching the final round of discussions.\r\n"
				+ "\r\n"
				+ "Your final level of interview(Technical+HR) is confirmed with us on 26th July 2024 @ 10.30 AM. Please plan the travel accordingly and be at the venue as soon as possible.\r\n"
				+ "\r\n"
				+ " Here are some things you can do to prepare:\r\n"
				+ "\r\n"
				+ "Technical Review: Refresh your memory on the technical skills and concepts discussed in previous interviews.\r\n"
				+ "Research the Company: Learn more about Evergent Technologies using our website: http://www.evergent.com/ \r\n"
				+ "Dress Professionally: First impressions matter, so dress professionally for the interview.\r\n"
				+ "Venue Details:\r\n"
				+ "11th Floor, SOHINI TECH PARK, Opposite to Gold Edge Residency,\r\n"
				+ "Financial District, Nanakramguda, Telangana 500032.\r\n"
				+ "\r\n"
				+ "Documents to carry: updated resume & Any of the Original Govt. ID proof(Aadhar or Pan card)\r\n"
				+ "\r\n"
				+ "NOTE: This interview is also part of the selection round.");
		System.out.println();
		System.out.println("To Start Technical Interview enter 1:");
		if(sc1.nextInt()==1) 
		{
			System.out.println("Q:Explain about Constructors in java?");
			System.out.println("Enter numbers from 1 to 5 to tell the answers");
			if(sc1.nextInt()==1) 
			{
				System.out.println("Constructors are mainly used for intialization ");
			}
			if(sc1.nextInt()==2) 
			{
				System.out.println("Class Name and Constructor Name should be Same");
			}
			if(sc1.nextInt()==3) 
			{
				System.out.println("There are two types of Constructors "
						+ "1:Default Constructor"
						+ "2:Parameterised Constructor");
			}
			if(sc1.nextInt()==4) 
			{
				System.out.println("We can access constructor while creation of object");
			}
			if(sc1.nextInt()==5) 
			{
				System.out.println("Constructor doesnt have any return type not even void,if void"
						+ "is declared it is considerd as method");
			}
			System.out.println("Enter w to write example ");
			if(sc1.next().equals("w")) 
			{
				System.out.println("public class Employee {\r\n"
						+ "	int eno;\r\n"
						+ "	String ename;\r\n"
						+ "	double sal;\r\n"
						+ "	public Employee3() {\r\n"
						+ "		System.out.println(\"Default Constructor\");\r\n"
						+ "	}\r\n"
						+ "	Employee3(int eno,String ename,double sal){\r\n"
						+ "		this.eno=eno;\r\n"
						+ "		this.ename=ename;\r\n"
						+ "		this.sal=sal;\r\n"
						+ "		\r\n"
						+ "	}\r\n"
						+ "	void display() {\r\n"
						+ "		System.out.println(\"Employee num is:\"+eno);\r\n"
						+ "		System.out.println(\"Employee name is:\"+ename);\r\n"
						+ "		System.out.println(\"Employee sal is:\"+sal);\r\n"
						+ "	}\r\n"
						+ "\r\n"
						+ "	public static void main(String[] args) {\r\n"
						+ "		new Employee3();\r\n"
						+ "		Employee3 emp2=  new Employee3(123, \"Hameed\", 50000);\r\n"
						+ "		emp2.display();\r\n"
						+ "		\r\n"
						+ "\r\n"
						+ "	}\r\n"
						+ "\r\n"
						+ "}");
			}
			System.out.println("Enter 7 to complete ");
			if(sc1.nextInt()==7) 
			{
				System.out.println("Congratulations You've cleared Technical Interview");
				System.out.println();
				System.out.println("All the Best for HR round");
			}
		}
		
		
	}
	
	public void hrInterview() 
	{
		System.out.println("Welcome to HR Round");
		System.out.println("Harsha:Are willing to sign 3 years employement bond?");
		System.out.println(" yes or no?");
		if(sc1.next().equals("yes")) 
		{
			System.out.println("Congratulations You've Become an employee of EVERGENT");
		}
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***Welcome to Evergent Hiring***");
		HiringEvergent he=new HiringEvergent();
		System.out.println("to check job notice enter 1");
		int m=sc.nextInt();
	    double cg;
		if(m==1) 
		{
			he.notice();
			System.out.println();
			System.out.println("*****If you are intrested Enter your cgpa*****");
			cg=sc.nextDouble();
			he.cgpa(cg);
			if(cg>=6) 
			{
				System.out.println("You are eligible to apply");
				he.aptitudeTest();
				he.technicalTest();
				System.out.println("Enter 11 if you reached office");
				if(sc.nextInt()==11) 
				{
					he.technicalInterview();
					
				}
				he.hrInterview();
			}
			else 
			{
				System.out.println("Not Eligible");
				System.out.println("Thank you for Exploring We'll Contact you if any openings available");
			}
			
			
		}
		//HAS A Relation
		EmployeeEvergent emp=new EmployeeEvergent();
		//new EmployeeEvergent();
		emp.EmployeeDet();
		emp.EmployeeInfo();
		System.out.println("To Know Employeeinfo :");
		emp.officeInfo();
		
		

	}

}
