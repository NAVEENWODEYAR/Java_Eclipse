// Check weather the given numbers are even or not.,
package com.oignon.coding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EvenNumbers 
{
	public static void main(String[] args)
	{
//		List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> l1 = Arrays.asList(2,4,6,8,10);
		Boolean bl = l1.stream().allMatch((n)-> n%2 == 0);
			System.out.println(bl);
	}

}
