package com.evergent.corejava.logicalprogs;

public class SwappingWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println("Before Swapping a is "+a+" and b is "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a is "+a+" and b is "+b);

	}

}
