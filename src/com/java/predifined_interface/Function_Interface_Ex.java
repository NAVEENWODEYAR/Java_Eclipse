package com.java.predifined_interface;

import java.util.function.Function;

public class Function_Interface_Ex implements Function<String, Number>
{
	// overriding the apply()
	public Number apply(String name) {
		System.out.println("Apply()- takes the string as input & prints the number as output");
		return name.length();
	}

	public static void main(String[] args) {
		// Function interface has the apply()
		Function obj = new Function_Interface_Ex();
		System.out.println("Length of the given string- " +obj.apply("Bhaskar"));
	}





}
