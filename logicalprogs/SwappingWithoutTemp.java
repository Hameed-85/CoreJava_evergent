package com.evergent.corejava.logicalprogs;

public class SwappingWithoutTemp {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before Swapping a is "+a+" and b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a is "+a+"and b is "+b);

	}

}
