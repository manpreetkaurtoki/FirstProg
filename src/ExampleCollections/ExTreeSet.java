package ExampleCollections;

import java.util.TreeSet;

public class ExTreeSet {
	public static void main(String[] arg) {
		TreeSet<Integer> mytreeSet = new TreeSet<Integer>();

		mytreeSet.add(5);
		mytreeSet.add(2);
		mytreeSet.add(0);
		mytreeSet.add(1);
		mytreeSet.add(5);
		mytreeSet.add(4);
		mytreeSet.add(3);
		
		//add elements
		System.out.println(mytreeSet);
		
		System.out.println(mytreeSet.getFirst());
		System.out.println(mytreeSet.getLast());
		
		//read
		for(int val: mytreeSet)
		{
			System.out.println(val);
		}
		
		//
		mytreeSet.remove(5);
		mytreeSet.add(6);
		System.out.println("After remove n add "+mytreeSet);
	
		//remove 
		System.out.println(mytreeSet.pollFirst());
		System.out.println(mytreeSet.pollLast());
		mytreeSet.remove(6);
		System.out.println(mytreeSet);
		System.out.println("After remove "+mytreeSet);
	}

}
