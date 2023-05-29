package com.java.predifined_interface;

import java.util.function.Predicate;

interface TestI
{
	public abstract boolean test(int i);
}

public class Predicate_Ex implements TestI
{
		// overriding the test()
		public boolean test(int age)
		{
			if (age > 25 )
			{
				System.out.println("Eligible for Marriage!");
				return true;
			}
			else
			return false;
		}
	
	public static void main(String[] args) 
	{
		// Predicate interface has test()- returns the boolean value
//			TestI t = new Predicate_Ex();
//				System.out.println(t.test(28));
//			
			// Using the predicate using the lambda expression
				String name = "Bhaskar";
			Predicate<String> p = (s)-> s.length()<10;
			System.out.println("Length of the string is normal "+ p.test(name));
	}

	
}

