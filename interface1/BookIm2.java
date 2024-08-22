package com.evergent.corejava.interface1;
//we cannot create object of interface instead we can create object refrence
public class BookIm2 implements Book {
	public void bookTitle() 
	{
		System.out.println("Core java"+cname);
	}
	public void bookAuthor() 
	{
		System.out.println("Oracle Author");
	}
	public void bookPrice() 
	{
		System.out.println("Rs:200");
	}
	public void show() 
	{
		System.out.println("This is Local Method");
	}
	

	public static void main(String[] args) {
		// only creating object reference of the interfaces
		Book book2=new BookIm2();
		book2.bookTitle();
		book2.bookAuthor();
		book2.bookPrice();
	//	book2.show();
		//The method show() is undefined for the type Book
		

	}

}
