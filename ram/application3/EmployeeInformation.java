package com.evergent.corejava.ram.application3;

public class EmployeeInformation extends BankAccountDetails implements Employeeinterface {
	int empno;
	double sal;
	String address;
	public void employeeInfo(int eno,float sal) throws Exception
	{
	 	this.empno=eno;
	 	this.sal=sal;
	}
	public void employeeAddress(String add) 
	{
		this.address=add;
	}
	public void employeeDetails() 
	{
		System.out.println("Employee No"+empno);
		System.out.println("Employee Sal"+sal);
		System.out.println("Employee address"+address);
		
	}
	//abstract class implementation
	 public void accountDetails() 
	{
	  System.out.println("My account Details is 12345678");	
	}
	 public void show() 
	 {
		 System.out.println("This is Local Method");
	 }

	public static void main(String[] args) throws Exception {
		//interface methods calling
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100, 50000);
		emp.employeeAddress("Banglore");
		emp.employeeDetails();
		//absract class
		emp.accountDetails();
		emp.bankDetails();
		//calling Bank RBI with HAS A
		BankRBI rbi1=new BankRBI();
		BankRBI rbi2=new BankRBI(3.3, 3.3);
		rbi1.getBankDetails();
		emp.show();

	}

}
