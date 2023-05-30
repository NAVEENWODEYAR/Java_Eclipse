package com.java.predifined_interface;

import java.util.function.Supplier;
public class Supplier_Ex2 
{

	public static void main(String[] args)
	{
		Supplier<Double> s = () -> {
			Double otp=(double) 0;
				for (int i=1; i<=1000; i++)
				{
					otp = otp + (int)(Math.random()*10);
				}
			return otp;
		};
		System.out.println(s.get());
	}

}
