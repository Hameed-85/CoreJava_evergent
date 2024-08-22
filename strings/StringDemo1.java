package com.evergent.corejava.strings;
//1)Creating String using new keyword.
//equals()  in String used to check the content.

//== method in String is used to check the Memory 
//location

public class StringDemo1 {

	public static void main(String[] args) {
		//String object is created and pointing to diffrent locations
		String str=new String("Hello");
		String str1=new String("Hello");
		if(str==str1) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		//checks the content of the String object
		if(str.equals(str1)) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}

	}

}
