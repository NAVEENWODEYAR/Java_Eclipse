package com.java.predifined_interface;

import java.util.function.Supplier;
public class Supplier_Ex3 
{

	public static void main(String[] args)
	{
		//  doesn’t take any input and it always returns some object.
		// 5 digit random otp using the lambda expression
		Supplier<String> sp = () -> {
					String otp = "";
						for (int i=1; i<=4; i++)
						{
							otp = otp + (int)(Math.random()*10);
						}
						return otp;
			};
			
			System.out.println(sp.get());
			System.out.println(sp.get());
	}

}
