package com.evergent.corejava.week1exam;
//Class definition
class Animal {
// Fields (Attributes)
private String name;
private int age;
// Constructor
public Animal(String name, int age) {
   this.name = name;
   this.age = age;
}
// Method (Behavior)
public void displayInfo() {
   System.out.println("Name: " + name);
   System.out.println("Age: " + age);
}}
//Subclass (Inheritance)
class Dog extends Animal {
private String breed;
public Dog(String name, int age, String breed) {
   super(name, age); // Call to superclass constructor
   this.breed = breed;
}
// Method overriding (Polymorphism)
public void displayInfo() {
   super.displayInfo();
   System.out.println("Breed: " + breed);
}
}
//Main class
public class Inheritance_Overriding8 {
public static void main(String[] args) {
   Dog dog = new Dog("Buddy", 5, "Golden Retriever");
   dog.displayInfo(); // Output: Name: Buddy, Age: 5, Breed: Golden Retriever
}
}