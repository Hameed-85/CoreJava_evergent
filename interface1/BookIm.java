package com.evergent.corejava.interface1;
//class implementing the interface

public class BookIm implements Book {
	//overiding the methods declared in in interfaces
	public void bookTitle() 
	{
		System.out.println("Core java");
	}
	public void bookAuthor() 
	{
		System.out.println("Oracle Author");
	}
	public void bookPrice() 
	{
		System.out.println("Rs:200");
	}
	//Local Metod
	public void show() 
	{
		System.out.println("This is Local Method");
	}
	

	public static void main(String[] args) {
		// creating object of the class
		BookIm book1=new BookIm();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		

	}

}
