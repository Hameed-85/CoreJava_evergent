package com.evergent.corejava.immutable;

public final class ImmutableString {
	private String value;
	public ImmutableString(String value) 
	{
		this.value=value;
	}
	public String MyValue() 
	{
		return value;
	}
	public String toString() 
	{
		return value;
	}
}
