package com.evergent.corejava.strings;
import java.util.*;
//write a java program to create a string and concat with other String

public class StringBuffer1 {

	public static void main(String[] args) {
			
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Intial String :"+sb);
		//appends the string from end
		sb.append("World");
		System.out.println("After appnd"+sb);
		sb.insert(1, "Java");
		//inserts the substring from index 1
		System.out.println(sb);
		sb.delete(1, 5);
		//deletes the substring from index 1 to 4
		System.out.println(sb);
		sb.replace(1, 4, "jav");
		//replaces the characters from index 1 to 3
		//with jav
		System.out.println(sb);
		//reverse the string
		sb.reverse();
		System.out.println(sb);
		//StringBuilder sb1=new StringBuilder("dghfhfuit873345gfghvjcjcjx ");
		//gives the capacity of the string buffer
		System.out.println(sb.capacity());
		//gives the length of the string
		System.out.println(sb.length());
	
		}

}
