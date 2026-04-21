package javaexampleinterface;

public class TestDoubts {
	public static void print() {
		System.out.print("I am print block");
	}

	static {
		System.out.print("I am static block");
	}

	public static void main(String arg[]) {
		System.out.print("I am main block");
		print();
		ClassA aobj = new ClassB();
		ClassA.A();
		System.out.println(ClassA.value);
		aobj.A1();

		ClassB obj2 = new ClassB();
		obj2.B();

		
		Duck d =new Duck();
		d.fly();
		d.swim();
		d.color();
	}

}