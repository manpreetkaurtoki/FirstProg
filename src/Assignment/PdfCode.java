package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class PdfCode {
	public static void main(String arg[]) {
		interator();
		minMAx();
		revArray();
		removeDupArrList();
		removeAdditionalCommon();
	}

	public static void interator() {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("A");
		myArrayList.add("B");
		myArrayList.add("D");
		myArrayList.add("E");
		myArrayList.add("C");

		Iterator<String> it = myArrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void minMAx() {

		int[] array = { 43, 12, 34, 56, 89, 100 };
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("min val : " + min);
		System.out.println("max val : " + max);
	}

	public static void revArray() {

		int[] array = { 43, 12, 34, 56, 89, 100 };
		int[] newarray = {};
		int n = array.length;

		// one way using arrayList
		ArrayList<Integer> newarArrayList = new ArrayList<Integer>();
		for (int i = array.length - 1; i >= 0; i--) {
			newarArrayList.add(array[i]);
		}
		System.out.println(newarArrayList);

		// using an array
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

	public static void removeDupArrList() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

		// Remove duplicates
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		ArrayList<Integer> result = new ArrayList<>(set);

		System.out.println(result);

		ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList("A", "C", "D", "D", "B", "C", "E", "E"));

		LinkedHashSet<String> myLinked = new LinkedHashSet<String>(myArrayList);
		System.out.println(myLinked);
	}

	public static void removeAdditionalCommon() {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		//list.removeAll(list2);
		
		list.retainAll(list2);
		System.out.println(list);
	}
}
