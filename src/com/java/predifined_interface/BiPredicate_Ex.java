package com.java.predifined_interface;

import java.util.function.BiPredicate;
public class BiPredicate_Ex 
{

	public static void main(String[] args) 
	{
		// BiPredicate<T,T>
		// To check the sum of two integers is even or odd
		BiPredicate<Integer,Integer> bp = (a,b) -> (a+b)%2 ==0 ;
		System.out.println("Sum of the numbers is even, "+ bp.test(25,24));

	}

}
