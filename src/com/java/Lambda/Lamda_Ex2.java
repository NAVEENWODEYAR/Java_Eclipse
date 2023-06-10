package com.java.Lambda;

interface Lambda_Ex2
{
	public abstract int add_No(int a, int b);
}
public class Lamda_Ex2 {

	public static void main(String[] args) {
		// interface method implementation
		Lambda_Ex2 l = (a,b) -> {
				System.out.println("Lambda Expression..,");
				System.out.println("Sum of the given numbers: "+ (a+b));
				return a;
		};
		l.add_No(4, 4);

	}

}
