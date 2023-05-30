package com.java.predifined_interface;

import java.util.function.BiFunction;
public class BiFunction_Ex 
{

	public static void main(String[] args) 
	{
		//Finding the sum of two integers using the BiFunctions
		BiFunction<Integer,Integer,Integer> bp = (a,b) -> a+b;
		System.out.println("Sum of the numbers- "+bp.apply(4,5));
		

	}

}
