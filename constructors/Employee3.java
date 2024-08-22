package com.evergent.corejava.constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	public Employee3() {
		System.out.println("Default Constructor");
	}
	Employee3(int eno,String ename,double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
	}
	void display() {
		System.out.println("Employee num is:"+eno);
		System.out.println("Employee name is:"+ename);
		System.out.println("Employee sal is:"+sal);
	}

	public static void main(String[] args) {
		new Employee3();
		Employee3 emp2=  new Employee3(123, "Hameed", 50000);
		emp2.display();
		

	}

}
