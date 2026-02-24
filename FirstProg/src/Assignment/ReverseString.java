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
	}
}
