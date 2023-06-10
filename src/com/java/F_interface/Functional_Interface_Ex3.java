package com.java.F_interface;

@FunctionalInterface
interface Test1
{
	void wish();
	
	public static int add_No(int a, int b)
	{
		System.out.println("Static method can be used without the refereance..,");
		return a+b;
	}
	
	public default void test()
	{
		System.out.println("Default method of the interface");
		
	}
}
public class Functional_Interface_Ex3
{
	public static void main(String[] args) 
	{
		System.out.println("Functional Interface");
		
		// Interface method implementation..,
//		Test1 t = () -> System.out.println("Iam from the Test1 interface");
		Test1 t = () -> System.out.println("Iam from the Test1 interface");
		t.wish();
		
	}
}