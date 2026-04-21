package javaexampleinterface;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat likes milk");
	}

	@Override
	public void sound() {
		System.out.println("Cat says meaw");

	}

}

