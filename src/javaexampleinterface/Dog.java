package javaexampleinterface;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats meat");
	}

	@Override
	public void sound() {
		System.out.println("Dog says woohoo");
	}

	// this not overridding its separate method of DOG class
	public void fur()
	{
		System.out.println("Dog's fur");
	}
	public void sleep()
	{
		System.out.println("Dog's sleep");
	}
}
