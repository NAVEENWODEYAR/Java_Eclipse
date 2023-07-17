// print numbers from 1 to 100 without loop
package com.oignon.coding;

public class PrintNumbers 
{
	public static void printNumbers(int n)
	{
		if(n<= 100)
		{
			System.out.println(n);
			printNumbers(n+1);
		}
	}
	public static void main(String[] args) 
	{
		printNumbers(1);
	}
}
