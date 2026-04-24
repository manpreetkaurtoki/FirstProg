package ExampleCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ExHashMap {
	public static void main(String[] arg) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(16, "Python");
		hashMap.put(3, "SELENIUM");
		hashMap.put(43, "C");
		hashMap.put(1, "Preet");
		hashMap.put(2, "JAVA");
		hashMap.put(43, "C++");
		hashMap.put(22, null);
		hashMap.put(12, null);

		// add

		System.out.println(hashMap);

		// read
		System.out.println(hashMap.get(3));

		// update
		// hashMap.

		// retrieve/read all key and values
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.entrySet());

		// all keys values
		for (int key : hashMap.keySet()) {
			System.out.println("KEY " + key + " vaue " + hashMap.get(key));
		}

		// iterator
		Iterator<Entry<Integer, String>> item = hashMap.entrySet().iterator();
		while (item.hasNext()) {
			Entry<Integer, String> entry = item.next();
			System.out.println(entry.getKey() + " ---"+entry.getValue());
		}
		// remove
		hashMap.remove(43, "C");
		hashMap.remove(16);
		System.out.println(hashMap);
	}

}
