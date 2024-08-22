package com.evergent.corejava.constructors;
class MyEmployee
{
	int eno;
	public MyEmployee() {
		
	}
	MyEmployee(int eno){
		System.out.println("Employe num is Super Class"+eno);
	}
}

public class Employee6 extends MyEmployee {
	//constructor as normal method
	  int eno;
		String ename;
		double sal;
		public Employee6() {
			System.out.println("Default Constructor");
		}
	  
		Employee6(int eno,String ename,double sal){
		    super(eno);
			this.ename=ename;
			this.sal=sal;
			
		}
		void display() {
			//System.out.println("Employee num is:"+eno);
			System.out.println("Employee name is:"+ename);
			System.out.println("Employee sal is:"+sal);
		}
	

	public static void main(String[] args) {
		new Employee6();
		Employee6 emp5= new Employee6(123,"Hameed",5000);
		emp5.display();
		

	}

}
