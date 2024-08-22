package com.evergent.corejava.javabeans;

public class EmployeeImp {
	public static void main(String args[]) 
	{
		//store the values to bean
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("Hameed");
		emp.setSal(20000);
		System.out.println("Employee No:"+emp.getEno());
		System.out.println("Employee Name "+emp.getEname());
		System.out.println("Employee sal:"+emp.getSal());
	}

}
