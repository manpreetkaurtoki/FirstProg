package Assignment;

import java.util.Scanner;

public class DemoGit {

	public static void main(String args[]) {

		// Swap Prog1

		int a = 100;
		int b = 15;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
		

		// count digits in number
		int number = 86734574;
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println(count);

		
		// number pallindrome
		int num1 = 345;
		int compareDigit = num1;
		int rev = 0;
		while (num1 != 0) {
			int lastDigit = num1 % 10;
			System.out.println(num1);
			rev = rev * 10 + lastDigit;
			num1 = num1 / 10;
		}
		if (compareDigit == rev) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

		// largest number;
		int largest = 0;
		int num = 345782;

		while (num>0) {
			int digit = num % 10; // get last digit
			if (digit > largest) {
				largest = digit;
			}

			num = num / 10; // remove last digit
		}

		System.out.println("Largest digit is: " + largest);

		// occurrence of digit
		
		int newNum= 12334335;
		System.out.print("Enter digit to find: ");
		 Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
		int counter = 0;

        while (newNum > 0) {
            int rem = newNum % 10;

            if (rem == digit) {
            	counter++;
            }

            newNum = newNum / 10;
        }

        System.out.println("Occurrence of digit = " + counter);

		
	}

}
