package com.evergent.corejava.static1;
//when static variable is modified then it also reflects to orginal value too
//whereas non static varaiable is modifieed it doesnt reflects to orginal value

public class StPerson6 {
	 //String name="Raju";
   static String name="Raju";
   int age=28;
   String adress="Hyd";
   public void display() 
   {
	   name="Welcome";
	   System.out.println("Name:"+name);
	   System.out.println("Age is:"+age);
	   System.out.println("Adress is "+adress);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StPerson6 stp=new StPerson6();
		stp.display();
		StPerson6 stp1=new StPerson6();
		System.out.println(stp1.name);
		

	}

}
