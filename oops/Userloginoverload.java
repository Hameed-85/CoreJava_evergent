package com.evergent.corejava.oops;

public class Userloginoverload {
	public void loginDemo() {
		System.out.println("Login Details");
	}
	public void loginDemo(String username,String pass) {
		System.out.println("UserName"+username);
		System.out.println("Password :"+pass);
	}
	public void loginDemo(String username,String pass,String captcha) {
		System.out.println("UserName"+username);
		System.out.println("Password :"+pass);
		System.out.println("Captcha is:"+captcha);
	}
	public void loginDemo(int mobile,String pass) {
		System.out.println("Mobile Number is"+mobile);
		System.out.println("Password :"+pass);
	}
	public void show() {
		System.out.println("Local Method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userloginoverload ul=new Userloginoverload();
		ul.loginDemo();
		ul.loginDemo("Hameed","Hameed123");
		ul.loginDemo("Hameed", "Hameed123", "@#1234");
		ul.loginDemo(8911234, "Hameed1234");
		ul.show();

	}

}
