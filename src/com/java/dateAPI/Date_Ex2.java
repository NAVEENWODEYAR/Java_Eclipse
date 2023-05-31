package com.java.dateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Date_Ex2 
{

	public static void main(String[] args) 
	{
		LocalDate  date = LocalDate.now();
		LocalDate dob = LocalDate.of(1996, 5, 6);
		System.out.println(Period.between(date, dob));
		System.out.println(date.isLeapYear());
	}

}
