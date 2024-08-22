package com.evergent.corejava.objectclassmethods;
class Person1
{
	String name;
	int age;
	public Person1(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	public String toString() 
	{
		return "Name is"+name+" Age is"+age;
	}
}

public class PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1("Hameed", 22);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		

	}

}
