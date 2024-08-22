package com.evergent.corejava.immutable;
 public final class  PersonImmutable {
	 private final String name;
	 private final int age;
	 //construvtor to intialize the final fields
	 public PersonImmutable(String name,int age) 
	 {
		 this.name=name;
		 this.age=age;
	 }
	 public String Myname() 
	 {
		 return name;
	 }
	 public int Myage() 
	 {
		 return age;
	 }
	
	

}
