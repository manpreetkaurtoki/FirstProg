package firstPack;

public abstract class Animal {
	public static int eyes= 2;
	Animal()
	{
		System.out.println("Animal Constructor");
	}
	public void eat()
	{
		System.out.println("All animal eats");
	}

	abstract void speak();
}
