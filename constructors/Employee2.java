package com.evergent.corejava.constructors;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	public Employee2() {
		System.out.println("Default Constructor");
	}
	Employee2(int eno1,String ename1,double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
		
	}
	void display() {
		System.out.println("Employee num is:"+eno);
		System.out.println("Employee name is:"+ename);
		System.out.println("Employee sal is:"+sal);
	}

	public static void main(String[] args) {
		new Employee2();
		Employee2 emp2=  new Employee2(123, "Hameed", 50000);
		emp2.display();
		

	}

}
