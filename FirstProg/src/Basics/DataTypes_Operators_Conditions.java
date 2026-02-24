package Basics;

public class DataTypes_Operators_Conditions {

	public static void main(String args[]) {
		
		int day = 3;
		switch(day)
		{
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		default: System.out.println("Invalid day");
		break;
		
		}
		
		
		int integer = 10;
		System.out.println(Integer.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Byte.SIZE);
		System.out.println(Character.SIZE);

		// primitive datatypes are immutable (fixed) when we reassigning
		// value ; it will replace the old value.
		integer = 20;
		System.out.println(integer);

		// print 1 to 5
		// while
		int j = 1;
		while (j <= 5) {
			System.out.println(j);
			j++;
		}

		// for -loop

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		// do-while
		// execute statement block even if the condition is false
		int age = 17;
		do {

			System.out.println("You can't vote");
			age++;
		} while (age <= 18);
		
		System.out.println(age);
		if(age >= 18)
		{
			System.out.println("You are eligible to vote");
			
		}
		else 
		{
			System.out.println("You can't vote");
		}
		
		//purpose of break;
		//it will break the condition when value will become 6
		//continue will skip the condition
		for (int i=0;i<=10;i++)
		{
			if(i ==4)
				continue;// move to loop again
			if(i==6) 
				break; // come out of loop
			System.out.println(i);
			
			}
		}
	

	
}
