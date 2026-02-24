package ExampleCollections;

import java.util.ArrayList;

public class ExampleArraylist {
	public static void main(String args[])
	{
		ArrayList<Integer> list= new ArrayList(12);
		
		list.add(1);
		list.add(6);
		list.add(8);
		list.add(90);
		
		list.remove(2);
		
		list.add(2,16);
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//for each
		for(int x: list)
		{
			System.out.println(x);
		}
		
		System.out.println(list.contains(3));
		System.out.println(list.contains(90));
		
		
		
	}

}
