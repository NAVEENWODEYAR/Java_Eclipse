package com.java.dateAPI;

import java.time.LocalDate;
import java.time.LocalTime;
public class Date_Ex4 
{

	public static void main(String[] args) 
	{
		// Date & Time Using the Joda API.,
		System.out.println("Date & Time are very accurate when using the Joda API.,");
		System.out.println(LocalDate.now().isLeapYear());
		System.out.println("Time is "+LocalTime.now());

	}

}
