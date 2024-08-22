package com.evergent.corejava.oops;

//import java.util.Calendar;

public class Calculation {
	int a=10;//attributes
	int b=20;
	int c;
	public void add() {//methods//step4
		c=a+b;//step4
		System.out.println("Addition is:"+c);//step6
	}
	public void sub() {//step-8
		c=a-b;//step-9
		System.out.println("Subtraction is: "+c);//step-11
	}
	public void mul() {//step-13
		c=a*b;//step-14
		System.out.println("Multiplication is:"+c);//step-14
	}
	
	public static void main(String args[]) {//step-1
	  Calculation	calc=new Calculation();//step2
	  calc.add();//step3
	  calc.sub();//step-7
	  calc.mul();//step-12
	  
	
		
	}//step-15

}//step-16
