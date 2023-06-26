package lambdaExpression;

import java.util.function.Predicate;

public class LambdaEx5
{

	public static void main(String[] args)
	{
		//Predicate to check weather the given number is greater than 100 or not..,
		Predicate<Integer> pd = n -> n>100;
		System.out.println("The given number is greater than 100, "+pd.test(100));

	}

}
