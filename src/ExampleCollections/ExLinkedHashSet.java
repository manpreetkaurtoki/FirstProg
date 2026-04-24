package ExampleCollections;

import java.util.LinkedHashSet;

public class ExLinkedHashSet {
	public static void main(String[] args) {

		LinkedHashSet<String> mylinkedHS = new LinkedHashSet<String>();
		mylinkedHS.add("Hello");
		mylinkedHS.add("JAVA");
		mylinkedHS.add("KAUR");
		mylinkedHS.add(null);
		mylinkedHS.add(null);
		mylinkedHS.add("KAUR");
		mylinkedHS.add("Python");
		
		//maintain order ,no duplicate, one one null
		System.out.println(mylinkedHS);
		
	System.out.println(	mylinkedHS.getFirst());
	System.out.println(	mylinkedHS.getLast());
	
	//read
	for(String val : mylinkedHS)
	{
		System.out.println(val);
	}
	 // Update (remove + add)
	mylinkedHS.remove("Python");
	mylinkedHS.add("Selenium");


	//delete
	mylinkedHS.remove("KAUR");
	System.out.println(mylinkedHS);
	}
}
