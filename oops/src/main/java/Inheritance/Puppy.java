package Inheritance;

public class Puppy extends Dog {
	int p=30;
	
	public void display3()
	{
		System.out.println("Number of puppies in animal planet is :  " +p);
		
	}
	

	public static void main(String[] args) {
		Puppy obj1= new Puppy();
		obj1.bark();
		obj1.display();
		obj1.display3();
		
		
		
	}		

	}

