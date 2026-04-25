package javaexampleinterface;

public class TestDoubts {
	public static void print() {

		System.out.println("I am print block");
		String a = "test";
		String b = new String(a);
		if (a == b) {
			System.out.println(a + b + " both and b is equal memeory reference");
		}
		if (a.equals(b)) {
			System.out.println(a + b + " both and b is equal content");

		}
	}

	public static void largeWithoutIf() {
		int num1 = 3;
		int num2 = 4;
		int max = (num1 > num2) ? num1 : num2;
		System.out.println(max + " is largest");
	}

	public static void countUpperLower() {
		String val = "Hello World";
		int upper = 0;
		int lower = 0;
		char[] a = val.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (Character.isUpperCase(a[i])) {
				upper++;
			} else if (Character.isLowerCase(a[i])) {
				lower++;
			}
		}

		System.out.println(upper + " count of upper");
		System.out.println(lower + " count of lower");
	}

	static {
		System.out.println("I am static block");
	}

	public static void splitString() {
		String str = "Java, Selenium, testNg,Maven";
		String[] newStr = str.split(",");
		for (int i = 0; i < newStr.length; i++) {
			System.out.println(newStr[i]);
		}
	}

	public static void stringConcat() {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "PQR";

		System.out.println(s1.concat(s2).concat(s3));
	}

	public static void countVowel() {
		String val = "Welcomeaa";
		int count = 0;
		char[] val1 = val.toCharArray();
		for (int i = 0; i < val1.length; i++) {
			if (val1[i] == 'a' || val1[i] == 'e' ||val1[i] == 'i' || val1[i] == 'o' || val1[i] == 'u'  ) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String arg[]) {

		
		String s= "SeleniumwithJava";
		String s1 ="seleniumwithjava";
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('z'));
		largeWithoutIf();
		System.out.println("I am main block");
		print();
		ClassA aobj = new ClassB();
		ClassA.A();
		System.out.println(ClassA.value);
		aobj.A1();

		ClassB obj2 = new ClassB();
		obj2.B();

		Duck d = new Duck();
		d.fly();
		d.swim();
		d.color();

		countUpperLower();

		splitString();
		stringConcat();
		countVowel();
	}

}