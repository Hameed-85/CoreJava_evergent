package com.evergent.corejava.abstract1;
//extending abstract class
public class ProductImp1 extends Product{
	//overridden abstract method
	public void newProduct() 
	{
		System.out.println("my new Product");
	}
	
	public void show() 
	{
		System.out.println("Local methods");
	}

	public static void main(String[] args) {
		ProductImp1 pi=new ProductImp1();
		pi.newProduct();
		pi.allProduct();
		pi.show();
		//by using object reference of abstract class
		Product pi1=new ProductImp1();
		pi1.allProduct();
		pi1.allProduct();

	}

}
