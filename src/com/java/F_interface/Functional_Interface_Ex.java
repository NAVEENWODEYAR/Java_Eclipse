package com.java.F_interface;

@FunctionalInterface
interface Functional_Ex
{
	public abstract void wish_Msg();
}

public class Functional_Interface_Ex implements Functional_Ex
{
	public void wish_Msg() 
	{
		System.out.println("Hello World");
		
	}
	public static void main(String[] args)
	{
		System.out.println("Functional Interface");
	}
}
