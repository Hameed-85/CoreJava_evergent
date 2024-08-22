package com.evergent.corejava.constructors;

public class Employee5 {
	//constructor as normal method
	  int eno;
		String ename;
		double sal;

	 Employee5(int eno) {
		 this.eno=eno;
		System.out.println("Default Constructor");
	}
	  
		Employee5(int eno,String ename,double sal){
			//this.eno=eno;
			this(eno);
			this.ename=ename;
			this.sal=sal;
			
		}
		void display() {
			System.out.println("Employee num is:"+eno);
			System.out.println("Employee name is:"+ename);
			System.out.println("Employee sal is:"+sal);
		}
	

	public static void main(String[] args) {
		//new Employee5();
		Employee5 emp5= new Employee5(123,"Hameed",5000);
		emp5.display();
		

	}

}
