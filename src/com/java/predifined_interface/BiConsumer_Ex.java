package com.java.predifined_interface;

import java.util.function.BiConsumer;
public class BiConsumer_Ex
{

	public static void main(String[] args) 
	{
		// find concatenation of two strings & print result on the console by using BiConsumer
		BiConsumer<String,String> bc = (s1,s2) ->  System.out.println(s1+s2);
								bc.accept("Ammu","Mounika");
	}

}
