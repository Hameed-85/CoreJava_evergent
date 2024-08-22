package com.evergent.corejava.week1exam;
//super() is call super class constructor 
class MyEmployee{
	int eno;
	public MyEmployee() {
		System.out.println("Super class constructor");
		
	}
	MyEmployee(int eno){
		this.eno=eno;
		System.out.println("Employee No super class  :"+eno);		
	} }

public class Employee6  extends MyEmployee
{
	int eno; //0
	String ename; //null
	double sal; // 0.0	
	Employee6(){
		System.out.println("Default Constructor");
	}	
	Employee6(int eno,String ename,double sal){
		super(eno);		
		this.ename=ename;
		this.sal=sal; 		
	}
	public void display() {	
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee sal  :"+sal);
	}
	public static void main(String[] args) { 		 
		new Employee6();
    Employee6 emp2= new Employee6(123,"Ravi",55000);
    emp2.display();
	}
}