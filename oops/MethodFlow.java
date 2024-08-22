package com.evergent.corejava.oops;

public class MethodFlow {
   //No Parameter with no return type
	public void show() {
		System.out.println("No parameter no return type");
	}
	// Parameter with no return type
	public void add(int a,int b) {
		System.out.println("Addition is:"+(a+b));
	}
	//Parameter with  return type
	public int mul(int a,int b) {
		return a*b;
	}
	
	//No Parameter with return type
	public int num() {
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf=new MethodFlow();
		mf.show();
		mf.add(10, 20);
		System.out.println("Mul is:"+mf.mul(10, 20));
		System.out.println(mf.num());

	}

}
