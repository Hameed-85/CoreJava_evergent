package com.evergent.corejava.exceptions;

public class ArrayIndexOutOfBoundException13 {
  public static void main(String args[]) 
  {
	  int arr[]= {1,2,3,4,5};
	  try 
	  {
		  System.out.println("Accessing elemnt at index 10"+arr[10]);
	  }
	  catch(ArrayIndexOutOfBoundsException e) 
	  {
		System.out.println("Array index out of bound "+e);  
	  }
  }

}
