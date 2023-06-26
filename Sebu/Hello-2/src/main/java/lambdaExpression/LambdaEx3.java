package lambdaExpression;

import java.util.function.Predicate;

public class LambdaEx3 
{
	public static void main(String[] args) 
	{
		// Predefined functional interface..,Predicate
		
		Predicate<Integer> p = i -> i/2 ==0;
		System.out.println(p.test(5));
		
	}

}
