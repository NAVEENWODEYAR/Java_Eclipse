package lambdaExpression;

import java.util.function.Function;

interface Test
{
	int square(int a);
}
public class LambdaEx1 implements Test
{
	public int square (int a)
	{
		System.out.println("Implementation of the interface method.,");
		return a*a;
	}
	public static void main(String args[])
	{
		// need object for accessing the instance methods,,
		System.out.println(new LambdaEx1().square(19));
		
		// using the predefined functional interface Function..,
		Function <Integer, Integer> f = (i) -> {return i*i;};
		System.out.println("Square of the number " + f.apply(5));
	}	
}
 