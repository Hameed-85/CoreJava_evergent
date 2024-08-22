package com.evergent.corejava.immutable;

public class MyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableString is=new ImmutableString("Hello String World");
		System.out.println(is.MyValue());
		System.out.println(is.toString());

	}

}
