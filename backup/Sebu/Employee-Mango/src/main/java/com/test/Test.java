package com.test;

public class Test {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		System.out.println(t1);			// Object class toString() executes
 		
		// Wrapper class object.,
		String s1 = new String("Boss");
		System.out.println(s1);
		
		// primitive variable..,
		int a = 5;
		System.out.println(a++);
		
		// Integer object.,
		Integer i = a;
		System.out.println(i);
	}

}
