// Iterate the hashMap
package com.oignon.coding;

import java.util.HashMap;
import java.util.Map;

public class HashMp 
{
	public static void main(String[] args)
	{
		HashMap<String, String> hm = new HashMap<>();
								hm.put("Name","Bella");
								hm.put("n","Ammie");
								hm.put("m","Dolly");
								hm.put("e","Clara");
								hm.put("a","Clara");
								hm.put("b","");
								hm.put("d","");
								hm.put("k","");
								hm.put("","dfs");
								hm.put("","as");
								
//							for (Map.Entry<String, String> mp : hm.entrySet())
//							{
//								System.out.println("Key "+ mp.getKey() + " Value "+mp.getValue());
//							}
								
								for(Object o: hm.entrySet())
								{
									System.out.println(o);
								}
	}
}
