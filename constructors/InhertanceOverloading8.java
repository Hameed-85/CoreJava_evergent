package com.evergent.corejava.constructors;
class Animal
{
	private String name;
	private int age;
	public Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayInfo() 
	{
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
	
}
class Dog extends Animal
{
	String breed;
	public Dog(String name,int age,String breed) 
	{
		super(name, age);
		this.breed=breed;
	}
	public void displayInfo() 
	{
		super.displayInfo();
		System.out.println("Breed is:"+breed);
	}
}

public class InhertanceOverloading8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Buddy",5,"Golden Retreiver");
		dog.displayInfo();

	}

}
