package javaexampleinterface;

interface Flyable {
	void fly();
	default void color()
	{
		System.out.println("Flyable color");
	}
}

interface Swimmable {
	void swim();
	default void color()
	{
		System.out.println("Swimmable color");
	}
}

public class Duck implements Flyable, Swimmable {

	@Override
	public void swim() {
		System.out.println("Duck can swim");
		
	}

	@Override
	public void fly() {
		System.out.println("Duck can fly");
	}

	 @Override
	    public void color() {
		 Swimmable.super.color();  
		 Flyable.super.color();
	    }


}
