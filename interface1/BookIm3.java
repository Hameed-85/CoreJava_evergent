package com.evergent.corejava.interface1;
//we can achieve multiple inheritance through interfaces
public class BookIm3 implements Book,MyDataInfo {
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
	public void addNewBook() 
	{
		System.out.println("New book is added Java New Version");
	}
	public void addNewbookPrice() 
	{
		System.out.println("New book Price:$200");
	}
	  public void MyData() 
	  {
		  System.out.println("My Data Interface");
	  }
	  
	public void show() 
	{
		System.out.println("This is Local Method");
	}
	

	public static void main(String[] args) {
		BookIm3 book3=new BookIm3();
		book3.bookTitle();
		book3.bookAuthor();
		book3.bookPrice();
	    book3.show();
	    book3.addNewBook();
	    book3.addNewbookPrice();
	    book3.MyData();
		//The method show() is undefined for the type Book
		

	}

}
