package com.evergent.corejava.week1exam;
public class ProductImpl3 extends Product3 {
	
	 ProductImpl3(){
		 System.out.println("ProductImpl3 : constructor");
	 }
	public void show() {
		System.out.println("Local show methods");
	}
	 
	public void newProduct() {
		 System.out.println("MY New Product");
	}

	public static void main(String[] args) {
		ProductImpl3 product1=new ProductImpl3();
		product1.show();
		product1.newProduct();
		product1.allProducts();
		
	} 
}