package ExampleCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArraylist {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList myList = new ArrayList();
		myList.add("a");
		myList.add(1);
		myList.add(1);
		myList.add(true);
		myList.add(null);
		myList.add(12.5);
		System.out.println(myList);
		// add data
		list.add(1);
		list.add(6);
		list.add(8);
		list.add(90);

		// delete data
		list.remove(2);

		list.add(2, 16);

		// update data
		list.set(2, 19);

		// read data
		System.out.println(list.get(2));
		System.out.println(list.size());
		// normal for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// for each
		for (int x : list) {
			System.out.println(x);
		}

		System.out.println(list.contains(3));
		System.out.println(list.contains(90));

		Iterator it = myList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
