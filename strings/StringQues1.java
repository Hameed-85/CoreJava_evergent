package com.evergent.corejava.strings;
//write a java program to create a string and check substring presence

public class StringQues1 {

	public static void main(String[] args) {
		String str="The quick Brown Fox jumps over the lazy dog";
		String str1="Fox";
		//String method(contains()-to check whether the substring 
		//is present in the string)
		boolean contains=str.contains(str1);
		System.out.println("Contains "+str1+" "+contains);
		
	}

}
