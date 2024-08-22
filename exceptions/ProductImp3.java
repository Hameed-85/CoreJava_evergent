package com.evergent.corejava.exceptions;
class ProductNotFoundExecption extends Exception
{
  public ProductNotFoundExecption(String mess) 
  {
	  System.out.println("Hello"+mess);
  }	
}

public class ProductImp3 {
	int pno=105;
	public void myData()throws ProductNotFoundExecption
	{
		if(pno>100) 
		{
			throw new ProductNotFoundExecption("This Product is not there");
		}
		else
		{
			System.out.println("Product is there");
		}
	}

	public static void main(String[] args) {
		try 
		{
			ProductImp3 p3=new ProductImp3();
			p3.myData();
		}
		catch(Exception e) 
		{
			System.out.println("Handle "+e);
		}
	}

}
