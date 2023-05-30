package com.java.predifined_interface;

import java.util.function.Function;
public class Function_Ex2
{
	public static int str_Len(String str)
	{
		System.out.println("Static method to print the length of the string");
		return str.length();
	}
	public static void main(String[] args) 
	{
		// Program to find the length of the string
		System.out.println("Length of the given string- "+str_Len("Ammu"));
		// Using the Function@FI
		Function<String, Integer> fn = (str) -> str.length();
		System.out.println("Length of the string--"+fn.apply("Bhaskar"));
	}

}
