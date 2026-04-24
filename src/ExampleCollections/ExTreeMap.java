package ExampleCollections;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExTreeMap {
	public static void main(String arg[]) {
		TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();
		
		//add
		tmap.put(5, null);
		tmap.put(1, null);
		tmap.put(4, "C");
		tmap.put(3, "B");
		tmap.put(2, "A");
		tmap.put(6,"A");
		tmap.put(6,"k");
		System.out.println(tmap);
		
		System.out.println(tmap.get(3));
		System.out.println(tmap.keySet());
		System.out.println(tmap.entrySet());
		
		tmap.put(3, "Z");
		System.out.println(tmap);
		
		tmap.remove(5);
		System.out.println(tmap);
		
		
		for (int key : tmap.keySet()) {
			System.out.println("KEY " + key + " vaue " + tmap.get(key));
		}

		// iterator
		Iterator<Entry<Integer, String>> item = tmap.entrySet().iterator();
		while (item.hasNext()) {
			Entry<Integer, String> entry = item.next();
			System.out.println(entry.getKey() + " ---"+entry.getValue());
		}
	}

}
