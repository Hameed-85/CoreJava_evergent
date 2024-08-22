package com.evergent.corejava.strings;

import java.util.Arrays;

//write a java program to create a string and concat with other String

public class StringQues5 {

	public static void main(String[] args) {
		String str="Java Technologies";
		 char []a=str.toCharArray();
		 for(int i=0;i<a.length;i++) 
		{
			 System.out.print(a[i]+",");
		}
	 String str1=Arrays.toString(a);
		System.out.println(str1);
		System.out.println(Arrays.toString(str.toCharArray()).length());
	}

}
