package com.evergent.corejava.oops;
class MyBigData{
	public void MyData() {
		System.out.println("My Big Data is method");
	}
}

public class MethodOverriding extends MyBigData{
    public void MyData() {
    	System.out.println("My Data in sub class");
    }
    public void show() {
    	System.out.println("Local show Method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mo=new MethodOverriding();
		mo.MyData();
		mo.show();

	}

}
