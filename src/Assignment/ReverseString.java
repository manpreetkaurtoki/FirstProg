package Assignment;

public class ReverseString {

	public static void main(String arg[]) {
		String s = "MOMY";
		char[] c = s.toCharArray();
		String newString = "";
		System.out.println(s.toCharArray());
		System.out.println(c.length);
		for (int i = c.length - 1; i >= 0; i--) {

			System.out.println("value at " + i + " " + c[i]);

			newString = newString + c[i];

		}
		System.out.println(newString);

		if (s.equals(newString)) {
			System.out.println("String is Pallindrome");
		} else {
			System.out.println("String is not Pallindrome");
		}
		duplicateArray();
	}
	
	public static void duplicateArray()
	{
		  int[] arr = {1, 2, 3, 4, 2, 5, 6, 3,6};

	        System.out.print("Duplicate values: ");

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.print(arr[i] + " ");
	                    break;
	                }
	            }
	        }
	}
}
