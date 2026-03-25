package Basics;

public class Abstraction {

	public static void main(String args[]) {
		// when we don't create object because its just a concept(abstract)

		Audi a1= new Audi();
		BMW b1= new BMW();
		a1.start();
		b1.start();
		
	}
}


abstract class Car {

	int price;

	abstract void start(); // ABTRACT method needs to override
	// abstract method will reside in abstract class
	// can't create object of abstract class
	// to call non abstract method of abstract we need to give reference of abstract class
}

class Audi extends Car {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("AUDI starting");
	}

}

class BMW extends Car {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW starting");
	}

}

//  interface - by default variable are static and method : abstract (no body)