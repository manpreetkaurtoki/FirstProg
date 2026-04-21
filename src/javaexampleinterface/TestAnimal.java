package javaexampleinterface;

public class TestAnimal {

	public static void main(String[] args) {

		Cat catobj = new Cat();
		catobj.eat();
		catobj.sound();
		catobj.fur();

		Animal obj = new Cat();
		obj.eat();
		obj.sound();
		obj.fur();

		Animal obj1 = new Dog();
		obj1.eat();
		obj1.sound();
		obj1.fur();

		Dog dogObj = new Dog();
		dogObj.eat();
		dogObj.sound();
		// dogObj.fur();
		dogObj.sleep();
		Animal.sleep();
	}

}
