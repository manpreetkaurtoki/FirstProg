package ExampleCollections;

import java.util.LinkedHashMap;

public class EXLinkedHashMap {
	public static void main(String arg[])
	{
		LinkedHashMap<Integer, String> lhs= new LinkedHashMap<Integer,String>();
		//add
		lhs.put(1, "A");
		lhs.put(3, "C");
		lhs.put(2, "B");
		lhs.put(5, "E");
		lhs.put(4, "D");
		lhs.put(6, null);
		lhs.put(null, null);
		lhs.put(null, "Z");
	
		System.out.println(lhs);
		
		//read
		System.out.println(lhs.get(2));
		System.out.println(lhs.keySet());
		System.out.println(lhs.values());
		System.out.println(lhs.entrySet());
		
		//update
		System.out.println(lhs.put(4, null));
		System.out.println(lhs);
		
		System.out.println(lhs);
		
	}

}
