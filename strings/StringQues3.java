package com.evergent.corejava.strings;
//write a java program to create a string reverse the order of characters

public class StringQues3 {

	public static void main(String[] args) {
		String str="Hello World!";
		
		StringBuilder rev=new StringBuilder(str).reverse();

		/*String str1="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			str1+=str.charAt(i);
		}
		System.out.println(str1);
		*/
		//String method(reverse()-to reverse of the String)
		System.out.println(rev);
		
		//

	}

}
