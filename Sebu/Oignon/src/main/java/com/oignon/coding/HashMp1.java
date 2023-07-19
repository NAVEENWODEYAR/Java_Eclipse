package com.oignon.coding;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMp1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<>();
								hm.put(null, null);
								hm.put(10, "A");
								hm.put(1, "Z");
								hm.put(9, "B");
								System.out.println(hm);
								
								
								// iterate the hashMap.,
								for(Object o: hm.entrySet())
								{
									System.out.println(o);
								}
	
			TreeMap<Integer, String> tm = new TreeMap();
					for(int i=0; i<= hm.size(); i++)
					{
					}
						
	}

}
