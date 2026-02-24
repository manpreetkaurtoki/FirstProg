package Basics;

public class MainClass {
	public static void main(String arg[]) {
		//default constructor is calling
		Person p1 = new Person();
		p1.name = "John";
		p1.age= 23;
		
		Person p2 = new Person(23,"Marry");
		
		
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		
		Developer d1= new Developer(34,"Rohit");
		d1.walk();
		p1.eat();
		p2.walk(1000);
		System.out.println(Person.count);
	}

}

class Person {
	String name;
	int age;
	static int count;
	
	public Person()
	{
		count++;
		System.out.println("creating an object");
	}
	
	public Person(int age,String name)
	{
		this();//calling another constructor of same current class
		this.name = name; //refer to class variable/parameter
		this.age= age;
		
	}
	public void walk() {
		System.out.println(name + " is walking");
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void walk(int steps) {
		System.out.println(name + " walked " + steps);
	}
}

class Developer extends Person
{
	public Developer(int age, String name)
	{
		super(age,name);//calling parent constructor
	}
	//polymorphism
	public void walk() {
		System.out.println("Developer "+name + " is walking");
	}
}
