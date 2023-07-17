// find the first element startswith__
package com.oignon.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StartsWith 
{
	public static void main(String[] args)
	{
		List<String> lt = Arrays.asList("","Bella","Annie","Domnic","Anand","Ammie");
					Optional<String> st = lt.stream().filter((n)->n.startsWith("A")).findFirst();
					System.out.println(st);
		
	}

}
