package com.evergent.corejava.week1exam;
public class BookImpl3 implements Book ,NewBook
{
	 public void bookTitle() {
		 
		 System.out.println("CoreJAVA  :"+cname);		 
	 }
	 public void bookAuthor() {
		 System.out.println("Oracle Crop");
		 
	 }
	 public void bookPrice() {
		 System.out.println("Rs. 550");
		 
	 }
	 public void show() {
		 System.out.println("Show is local method");
	 }
	
		public void addNewBook() {
			System.out.println("JavaNew Version");
			
		}
		public void myData() {
	      System.out.println("My Data Interface");
		}
	public static void main(String[] args) {
			BookImpl3 book1=new BookImpl3();
		         book1.bookTitle();
		         book1.bookAuthor();
		         book1.bookPrice();
		         book1.show();    
		         book1.addNewBook();
		         book1.myData();
	}
}
