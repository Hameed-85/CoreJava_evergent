package com.evergent.corejava.javabeans;

public class Product {
	public static void main(String args[]) 
	{
		ProductBean pb=new ProductBean(100, "Laptop", 50000);
		System.out.println( "Product number is"+pb.getPno());
		System.out.println("Product is"+pb.getPname());
		System.out.println("Product price is"+pb.getPrice());
	}

}
