package com.evergent.corejava.strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is powerful programming language";
		String []words=str.split(" ");
		//for each advance loop
		for(String s:words) 
		{
			System.out.println(s);
		}
		System.out.println();

	}

}
