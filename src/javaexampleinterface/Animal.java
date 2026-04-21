package javaexampleinterface;

public interface Animal {

	public void eat();
	public void sound();
	
	public static void sleep() {
		System.out.println("Animal sleeps");
	}
	public default void fur()
	{
		System.out.println("Animal has fur");
	}
}
