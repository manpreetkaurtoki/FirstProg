package ExampleCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class A {
	public void hello() {
		System.out.println("HelloA");
	}
}

class B extends A {
	public void hello() {
		System.out.println("HelloB");
		Set<Integer> myset = new HashSet<Integer>();
		myset.add(1);
		myset.add(1);
		myset.add(3);
		myset.add(4);
		myset.add(3);
		myset.add(1);
		// myset.add(null);

		TreeSet<Integer> mytree = new TreeSet<Integer>(myset);
		mytree.addAll(myset);
		System.out.println("Size of set" + mytree.size());
		System.out.println("Size of set" + myset.size());
	}

	public static void main(String[] ard)

	{
		B obj = new B();
		obj.hello();
	}

}