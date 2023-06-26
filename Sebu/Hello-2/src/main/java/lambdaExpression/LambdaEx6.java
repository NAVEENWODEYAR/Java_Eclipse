package lambdaExpression;

import java.util.function.Predicate;

public class LambdaEx6 
{
	public static void main(String args[])
	{
		// Predicate to check weather the length of the given string is greater than 5 or not.,
		Predicate <String> pd = s -> s.length() > 5;
		System.out.println(pd.test("Bhaskar"));
	}
}
