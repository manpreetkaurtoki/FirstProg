package ExampleCollections;


class A
{
	public void hello()
	{
		System.out.println("HelloA");
	}
}
class B extends A
{
	public void hello()
	{
		System.out.println("HelloB");
	
	}
	public static void main(String[] ard)

	{
		B obj= new B();
		obj.hello();
	}
	
}