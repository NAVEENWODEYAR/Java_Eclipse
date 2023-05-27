package com.java.F_interface;

interface Test
{
	// abstract method
	public abstract void m1();
	
	// static method
	public static int add_No(int a)
	{
		System.out.println("Static method of the Test interface");
		System.out.println("Static method means class level");
		return a;
	}
	
	// default method 
	public default void wish_Msg()
	{
		System.out.println("Good Morning");
	}
}
public class Functional_Interface_Ex1 implements Test
{
	public void m1() 
	{
		System.out.println("Abstract methods has to be implemented in the implementation class");
	}

	// main method
	public static void main(String[] args) 
	{
		// object creation 
		Test t = new Functional_Interface_Ex1 ();
			t.m1();
			t.wish_Msg();
			System.out.println(Test.add_No(5));
	}	
}
