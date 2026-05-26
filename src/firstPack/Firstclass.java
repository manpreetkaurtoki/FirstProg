package firstPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.print("hello my first program");
		listToMapBasedonLength();
		countCharacFreq();
		String value = "aabccddde";
		String newVal = "";
		int countA = 0;
		int[] freq = new int[256];
		char[] a = value.toCharArray();
		for (int i = 0; i < a.length; i++) {
			freq[a[i]]++;
			if (a[i] == 'a') {
				countA++;

			}
		}

		for (int i = a.length - 1; i >= 0; i--) {

			newVal = newVal + a[i];

		}
		System.out.println("Count of a: " + countA);
		System.out.println("New String " + newVal);

		for (int i = 0; i < a.length; i++) {
			if (freq[a[i]] == 1) {
				System.out.println("First non-repeating character: " + value.charAt(i));
				// return;
			}
		}
		int[] arr = { 1, -2, 3, 4, 7, 90, 234 };

		// search an element in array
		int val = 27;
		for (int i : arr) {
			System.out.println(i);
			if (i == val) {
				System.out.println("Element found");
			}
		}

		// check max value in array
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > res) {
				res = arr[i];
			}
		}
		System.out.println(res + " is a maximum value in array");

		// smallest
		int small = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println(small + " is a minimum value in array");

		// reverse an array
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		int sum = 0;
		// Sum of array
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of array is" + sum);

		for (int i = 1; i <= 10; i++) {
			System.out.println(7 * i);
		}
		System.out.println("number of eyes" + Animal.eyes);
		Animal cat = new Cat();
		cat.eat();
		cat.speak();

	}

	public static void listToMapBasedonLength() {
		List<String> list = Arrays.asList("apple", "bat", "banana", "cat", "dog", "orange", "cucumber", "watermelon");

		Map<Integer, List<String>> map = new HashMap<>();

		for (String word : list) {
			int len = word.length();

			// if key doesn't exist, create new list
			map.putIfAbsent(len, new ArrayList<>());

			// add word to corresponding length group
			map.get(len).add(word);
		}

		// print result
		System.out.println(map);
	}

	public static void countCharacFreq() {
		String myString = "Helloo Wworldd";
		myString = myString.replace(" ", "");

		Map<Character, Integer> count = new HashMap();
		for (char c : myString.toCharArray()) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}

		// Print result
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
