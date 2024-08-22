package com.evergent.corejava.strings;
public class StringDemo2 {

	public static void main(String[] args) {
		//Creating String using literals
		String str="Hello";
		String str1="Hello";
		//== method in String is used to 
		//check the Memory location.
		if(str==str1) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		//equals() in String used to check 
		//the content.
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
