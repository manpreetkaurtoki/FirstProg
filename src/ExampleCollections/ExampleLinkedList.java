package ExampleCollections;

import java.util.LinkedList;

public class ExampleLinkedList {

	public static void main(String[] arg) {
		LinkedList<String> linkedList = new LinkedList();
		
		//add
		
		linkedList.add("hello");
		linkedList.add("java");
		linkedList.add("selenium");
		linkedList.add("python");
		linkedList.add(null);
		linkedList.add(null);
		
		linkedList.add("python");
		linkedList.addFirst("Good Morning");
		linkedList.addLast("Bie");
		System.out.println(linkedList);

		
		//read
		System.out.println(linkedList.get(2));
		
		//update
		linkedList.set(2, "C++");
		System.out.println(linkedList);
		//remove
		linkedList.remove(0);
		System.out.println(linkedList);
		
	}
}
