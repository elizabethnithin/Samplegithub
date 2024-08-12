package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntergerClass {

	public static void main(String[] args) {
		
		ArrayList <Integer> list1= new ArrayList <Integer> ();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		System.out.println(list1);
		
		ArrayList <Character> list2= new ArrayList <Character> ();
		list2.add('a');
		list2.add('b');
		list2.add('c');
		System.out.println(list2);
		
		ArrayList <Character> list3= new ArrayList <Character> ();
		list3.add('a');
		list3.add('y');
		list3.add('z');
		
		list2.addAll(list3);
		System.out.println(list2);
		
		list2.removeAll(list3);
		System.out.println(list2);
		
		Collections.sort(list3);
		System.out.println(list3);
		
	
		System.out.println(list2.contains('a'));
		
	}

}
