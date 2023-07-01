package lambdaExpression;

import java.util.function.Predicate;

public class LamdaEx4 {

	public static void main(String[] args) {
		// Predicate
		Predicate <String> p = s -> s.length() >10;
		System.out.println(p.test("Bhaskar K"));
	}
}
