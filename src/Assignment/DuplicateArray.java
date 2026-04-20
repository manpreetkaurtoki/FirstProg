package Assignment;

public class DuplicateArray {

	public static void main(String arg[]) {
		// find duplicate element in array

		int ar[] = { 1, 4, 5, 8, 9, 0, 3, 1, 2, 3, 4, 8 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Duplicate: " + ar[i]);
					break;
				}
			}

		}

		// smallest and largest element in array
		int arr[] = { 9, 3, 4, 2, 1, 4, 8 };
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];

			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("largest number in array is : " + largest);
		System.out.println("smallest number in array is : " + smallest);

		// Reverse an array
		int[] arrRev = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Reverse logic
		for (int i = 0; i < arrRev.length / 2; i++) {
			int temp = arrRev[i];
			arrRev[i] = arrRev[arrRev.length - 1 - i];
			arrRev[arrRev.length - 1 - i] = temp;
		}

		// Print reversed array
		System.out.print("Reversed array: ");
		for (int num : arrRev) {
			System.out.print(num + " ");
		}

		// Sum of array
		int[] sumArr = { 1, 4, 5, 6, 7, 3 };
		int sum = 0;
		for (int i = 0; i < sumArr.length; i++) {
			sum = sum + sumArr[i];
		}
		System.out.println("Sum of Array is : " + sum);
		
		
	}
}
