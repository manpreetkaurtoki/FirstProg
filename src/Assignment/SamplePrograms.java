package Assignment;

public class SamplePrograms {
	public static void main(String arg[]) {

		// number rev, number pallindrome
		int num = 123456;
		int compare = num;
		int rev = 0;
		int count = 0;
		while (num != 0) {
			int lastDigit = num % 10;
			rev = rev * 10 + lastDigit;
			num = num / 10;
			count++;
		}
		System.out.println("digits in number " + count);
		if (compare == rev) {
			System.out.println("Number pallindrome");
		} else {
			System.out.println(rev);
			System.out.println("Number not pallindrome");
		}
		factorial();
		fibo();
		prime();
	}

	// factorial
	public static void factorial() {
		int num = 6;
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
	}

	public static void fibo() {
		int num = 9;// 
		int first = 0;
		int second = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}

	}
	public static void prime() {
		int num= 1;
		int primeCheck=0;
		for (int i=1;i<=num;i++)
		{
			if(num%2==0)
			{
				primeCheck++;
			}
		}
		if (primeCheck==2)
		{
			System.out.println("It is prime");
		}
		else
		{
			System.out.println("It is not prime");
		}
	}


}
