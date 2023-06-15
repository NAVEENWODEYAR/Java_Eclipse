package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryLst_Ex2 {

	public static void main(String[] args)
	{
		@SuppressWarnings("Unchecked")
		ArrayList l1 = new ArrayList();
				l1.add(1);
				l1.add("One");
				l1.add(2);
				l1.add("Two");
				l1.add(3);
				l1.add("Three");
				l1.add(4);
				l1.add("Four");
				System.out.println(l1);
				System.out.println(l1.get(1));
				l1.remove(1);
				System.out.println(l1.get(1));
				l1.set(1, "One");
				System.out.println(l1.get(1));
				System.out.println(l1.isEmpty());
				System.out.print("*******\n");
				
				// Iterating the list using the iterator..,
				Iterator it = l1.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
					System.out.println("\r");
				}
	}

}
