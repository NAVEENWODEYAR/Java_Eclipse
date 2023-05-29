package com.java.predifined_interface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

public class Supplier_Ex implements Supplier<LocalTime> 
{
    // providing the implementation	
		public LocalTime get() 
		{
			return LocalTime.now();
		}
		
	public static void main(String[] args) 
	{
		// Calling the get() using the class object
		Supplier s = new Supplier_Ex();
		System.out.println("Time- " +s.get());

		// Using the Supplier interface
		Supplier<LocalDate> s1 = () -> LocalDate.now();
		System.out.println("Today is "+s1.get());
		System.out.println(Math.sqrt(100));
	}

}
