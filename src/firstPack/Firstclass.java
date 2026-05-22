package firstPack;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.print("hello my first program");

		String value = "aabccddde";
		String newVal = "";
		int countA = 0;
		int[] freq = new int[256];
		char[] a = value.toCharArray();
		for (int i = 0; i < a.length; i++) {
			freq[value.charAt(i)]++;
			if (a[i] == 'a') {
				countA++;
				
			}
		}

		
		for (int i = a.length - 1; i >= 0; i--) {

			newVal = newVal + a[i];

		}
		System.out.println("Count of a: " + countA);
		System.out.println("New String " + newVal);

		for (int i = 0; i < value.length(); i++) {
            if (freq[value.charAt(i)] == 1) {
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

}
