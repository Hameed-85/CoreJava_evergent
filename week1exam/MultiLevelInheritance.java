package com.evergent.corejava.week1exam;

class Myperson
{
	   public void personInfo() {
		   System.out.println("Rajesh");
		   
	   }
}
class PersonDetails  extends Myperson{
 	public void personData() {
 		System.out.println("Hyderabad");
 	}
 }
public class MultiLevelInheritance extends PersonDetails {
	public void show() {
		System.out.println("Local methods ");
	}
	public static void main(String[] args) {
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.personInfo();
		mi.personData();
		mi.show();
	}
}