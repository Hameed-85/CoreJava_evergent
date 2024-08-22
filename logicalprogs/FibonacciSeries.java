package com.evergent.corejava.logicalprogs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib=0,fib1=1;
		int n=5;
		for(int i=0;i<=n;i++) {
			int fib2=fib+fib1;
			System.out.print(fib+" ");
			fib=fib1;
			fib1=fib2;
		}
		System.out.println();

	}

}
