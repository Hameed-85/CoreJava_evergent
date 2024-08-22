package com.evergent.corejava.oops;
class MyPerson{
	public void personInfo() {
		System.out.println("Rajesh");
	}
}
class PersonDetails extends MyPerson{
	public void personData() {
		System.out.println("Hyd");
	}
}

public class MultilevelInheritence extends PersonDetails {
	public void show() {
		System.out.println("Local");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MultilevelInheritence ml=new MultilevelInheritence();
     
     ml.personInfo();
     ml.personData();
     ml.show();
	}

}
