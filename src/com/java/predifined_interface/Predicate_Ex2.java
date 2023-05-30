package com.java.predifined_interface;

import java.util.function.Predicate;
public class Predicate_Ex2 
{

	public static boolean check_Digit(int num)
	{
		if (num >-10 && num <10)
		{
			System.out.println(num + ",is single digit");
			return true;
		}
		else
		{
			System.out.println(num + ",is not single digit number");
			return false;
		}
	}
	
	
	public static void main(String[] args) 
	{
		// Java program to check weather the number is single digit or not
		System.out.println(check_Digit(8));
		
		// Using the predefined FI predicate
		Predicate<Integer> p = (digit)-> (digit > -10) && (digit <10);
		System.out.println("Given number is single digit- "+p.test(11));
		
	}

}
