package listexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {
	
	public static void main (String args[])
	{
		List <String> list1= new ArrayList <String> ();
		list1.add("Elz");
		list1.add("Pooja");
		list1.add("Sneha");
		list1.add("Sneha");
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		
		System.out.println("Non generic collection");
		
		ArrayList list2 =new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add("Welcome");
		list2.add(5.5f);
		System.out.println(list2);
		
		System.out.println(" generic collection");
		ArrayList <String> list3 =new ArrayList <String>();
		list3.add("Hi");
		list3.add("Welcome");
		list3.add("Home");
		System.out.println(list3);
		
		list1.remove("Elz");
		//list1.remove("1");
		System.out.println(list1);
		
		
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		
		list1.set(2,"Nazrin");
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("for each group");  // enhanced for loop
		 
		for(String i:list1)
		{
			System.out.println(i);
		}
		
		System.out.println("Iterator");
		
		Iterator <String> i=list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		i.remove();  // Remove last element
		System.out.println(list1);
		
		
		
	}

}
