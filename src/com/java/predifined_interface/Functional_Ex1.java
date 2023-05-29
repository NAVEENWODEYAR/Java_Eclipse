package com.java.predifined_interface;

import java.util.function.Function;

public class Functional_Ex1 {

	public static void main(String[] args) {
		//Using the Function  using the lambda expression
		Function<String, Number> f = (name) ->{
			System.out.println("Length of the given string- "+ name.length());
			return name.lastIndexOf("a");
		};
		f.apply("Bhaskar");
		System.out.println(f.apply("Mounika"));

	}

}
