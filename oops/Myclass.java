package com.evergent.corejava.oops;

public class Myclass extends Calculation{
	public void show() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass mc=new Myclass();
		mc.show();
		mc.add();
		

	}

}
