package com.java.predifined_interface;

import java.util.function.Consumer;
public class Consumer_Ex2 
{

	public static void main(String[] args) 
	{
		// Consumer is used when we have to provide some input parameter, perform certain operation, but don’t need to return anything,
		Consumer<String> c = st -> System.out.println(st);
		c.accept("Consumer takes input but doesn't write anything");
	}

}
