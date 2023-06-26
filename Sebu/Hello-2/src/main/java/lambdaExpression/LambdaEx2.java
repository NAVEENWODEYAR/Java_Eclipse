package lambdaExpression;

import java.util.function.Function;

public class LambdaEx2 
{

	public static void main(String[] args) 
	{
		// Predefined functional interface..,
		Function <Integer, Integer> f = (n) -> {return n*n;};
		System.out.println("Square of the number "+f.apply(90));
		Function <Integer, Integer> f1 = i ->  i*i;
		System.out.println(f1.apply(12));

	}

}
