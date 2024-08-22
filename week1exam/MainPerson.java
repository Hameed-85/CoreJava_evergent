package com.evergent.corejava.week1exam;
public class MainPerson {
    public static void main(String[] args) {
    	PersonImmutable person = new PersonImmutable("Raju", 30);

        
        System.out.println("Name: " + person.myName()); // Output: Name: Raju
        System.out.println("Age: " + person.myAge());   // Output: Age: 30
       

    }
}