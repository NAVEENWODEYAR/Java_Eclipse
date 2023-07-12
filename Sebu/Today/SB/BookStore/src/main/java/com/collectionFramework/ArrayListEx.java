package com.collectionFramework;

import java.util.*;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		// creating an list object
		List l1 = new ArrayList();
		System.out.println(l1);
			l1.add("One");
			l1.add("Two");
			l1.add("Three");
			l1.add("Four");
			l1.add("Five");
			
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1);
			
	}
}
