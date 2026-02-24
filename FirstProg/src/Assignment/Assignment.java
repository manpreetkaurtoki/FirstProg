package Assignment;

public class Assignment {

	public static void main(String arg[]) {
		// smallest largest
		int n = 58322229;
		int small = 9;
		int large = 0;
		int num = n;
		int even=0;
		int odd=0;
		int compareDigit = 2;
		int counter = 0;
		
		while (num > 0) {
			int val = num % 10;
			//System.out.println(val);
			// find largest 
			if (val > large) {
				large = val;
			}
			//find smallest
			if (val < small) {
				small = val;
			}
			// how many times two occur in number
			if(val ==2)
			{
				counter++;
			}
			// count even
			if(val%2==0)
			{
				//System.out.println(even);
				even++;
			}
			else
				// count odd
			{
				//System.out.println(odd);
				odd++;
			}
			
			num = num / 10;
		}
		System.out.println(small);
		System.out.println(large);
		System.out.println(even);
		System.out.println(odd);
		System.out.println(counter);
		// number of even and oddd
		// int num1= 48271;
		
		
	}
	

}
