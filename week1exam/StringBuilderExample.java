package com.evergent.corejava.week1exam;
/*
append(): adds a string to the end of the current string
- insert(): adds a string at a specific position in the current string
- replace(): replaces a substring with a new string
- delete(): removes a substring from the current string
- reverse(): reverses the order of characters in the current string
*/ 
public class StringBuilderExample {
   public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Hello");
       System.out.println("Initial string: " + sb);
       // Append a string
       sb.append(" World!");
       System.out.println("After append: " + sb);
       // Insert a string at a specific position
       sb.insert(6, "Beautiful ");
       System.out.println("After insert: " + sb); 
       // Replace a substring
       sb.replace(0, 5, "Hi");
       System.out.println("After replace: " + sb);
       // Delete a substring
       sb.delete(0, 3);
       System.out.println("After delete: " + sb);
       // Reverse the string
       sb.reverse();
       System.out.println("After reverse: " + sb);
   }
}

