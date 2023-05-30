package com.java.predifined_interface;

import java.util.function.Consumer;

interface C_Test
{
	public abstract void accept(int i);
}
public class Consumer_Ex implements C_Test
{
	public void accept(int a)
	{
		System.out.println("Consumer interface has accept()"+a);
	}

	public static void main(String[] args)
	{
		// Consumer interface
//		C_Test t = new Consumer_Ex();
//				t.accept(1);
		// Consumer using the lambda expression
		Consumer<String> c = (String name) ->  System.out.println("Ammu "+name);
						c.accept("Mounika");
	}

}
