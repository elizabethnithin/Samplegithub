package listexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Set <String> s1= new HashSet <String> ();
			s1.add("mango");
			s1.add("Orange");
			s1.add("apple");
			s1.add("hi");
			s1.add(null);
			
			System.out.println(s1);
			
			HashSet  s2 = new HashSet();
			s2.add("Hello");
			s2.add(4);
			System.out.println(s2);
			
			HashSet <String>  s3 = new HashSet <String>();
			s3.add("welcome");
			System.out.println(s3);
			
			s1.remove("mango");
			System.out.println(s1);
			
			
			System.out.println(s1.size());
			
			
			System.out.println(s2.contains("Hello"));
			
			
			Iterator <String> i=s1.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			
			s1.addAll(s2);
			System.out.println(s1);
			
			s1.removeAll(s2);
			System.out.println(s1);

	}

}
