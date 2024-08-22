package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product3{
	public ProductImpl3() {
		System.out.println("ProductImp3 Constructor");
	}
	public void show() 
	{
		System.out.println("Local show method");
	}
	public void newProduct() 
	{
		System.out.println("My new Product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl3 pi=new ProductImpl3();
		pi.show();
		pi.newProduct();
		pi.allProducts();

	}

}
