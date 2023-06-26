package streamAPI;

import java.util.*;
import java.util.Iterator;

public class StreamEx1 {

	public static void main(String[] args) 
	{
		// creating the Collection..,
		List l2 =  Arrays.asList("One","Two","Three","Four","Five");
			System.out.println(l2);
			System.out.println(l2.isEmpty());
			l2.forEach(n->System.out.println(n));
			Iterator it = l2.iterator();
			
	}
}
