package ExampleCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

	public static void main(String[] arg) {
		HashSet myset = new HashSet();
		// Set myset = new HashSet();

		HashSet<String> myset1 = new HashSet<String>();
		// adding elements
		myset.add("JAVA");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		myset.add(2);
		myset.add("JAVA");
		myset.add(2);
		System.out.println(myset);

		// remove
		myset.remove(100);
		System.out.println(myset);

		ArrayList myList = new ArrayList(myset);
		System.out.println(myList);
		System.out.println(myList.get(1));

		// Read all elements from set using for each
		for (Object x : myset) {
			System.out.println(x);
		}

		// read element using Iterator
		Iterator it = myset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
