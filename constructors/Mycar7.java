package com.evergent.corejava.constructors;
class Car{
	String color;
	int maxSpeed;
	Car(){
		color="White";
		maxSpeed=120;
	}
	Car(String color,int maxSpeed)
	{
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display() 
	{
		System.out.println("Color is"+color);
		System.out.println("MaxSpeed is"+maxSpeed);
	}
}

public class Mycar7 {

	
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("Red",150);
		c1.display();
		c2.display();

	}

}
