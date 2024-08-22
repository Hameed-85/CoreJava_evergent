package com.evergent.corejava.week1exam;
public class UserLogin { 
	  public void loginDetails() {
		  System.out.println("Login Details");		  
	  }	
	 public void loginDetails(String username,String pass) {
		 System.out.println("Username :"+username);
		 System.out.println("Password "+pass);
	 }
	 public void loginDetails(String uname,String pass,String capgcha) {
		 System.out.println("Username :"+uname);
		 System.out.println("Password "+pass);
		 System.out.println("Captcha :"+capgcha);
	 }	 
	public int  loginDetails(int mobile,String pass) {
		System.out.println("Mobile :"+mobile);
		System.out.println("Pass :"+pass);
		return 0;
		}
	public void show() {
		System.out.println("method ");
	}
	public static void main(String[] args) {
		UserLogin ulogin =new UserLogin();
		ulogin.loginDetails();
		ulogin.loginDetails("Raj", "Raj123");
		ulogin.loginDetails("Ravi", "Ravi123", "abc");
		ulogin.loginDetails(11111111, "abc123");
		ulogin.show(); 
	}
}
