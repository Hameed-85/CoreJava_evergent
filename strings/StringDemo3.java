package com.evergent.corejava.strings;

public class StringDemo3 {

	public static void main(String[] args) {
		String str=new String("   Hello World   ");
		//4)length()-To know the length of the String,
		System.out.println(str.length());
		//2)String methods (toLowerCase()-Changes the complete String into lowercase,
		System.out.println(str.toLowerCase());
		//3)toUpperCase()-Converts the complete String into uppercase,
		System.out.println(str.toUpperCase());
		//5)trim()-To remove the spaces before the String)
		System.out.println(str.trim());

	}

}
