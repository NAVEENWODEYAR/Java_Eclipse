package com.java.dateAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Date_Ex3 
{

	public static void main(String[] args) 
	{
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		ZoneId zone1 = ZoneId.of("America/New_York");
//		ZonedDateTime time = ZonedDateTime.now(zone);
//		ZonedDateTime time1 = ZonedDateTime.now(zone1);
//			System.out.println(time);
			System.out.println(ZonedDateTime.now(zone1));
			System.out.println(ZonedDateTime.now(zone));
		
	}

}
