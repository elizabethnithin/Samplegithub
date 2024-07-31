package Inheritance;

public class Car extends Vehicle {

	int b=5;
	
	public void display2()
	{
		System.out.println("Number of car is" +b);
	}
	public static void main(String[] args)
	{
		Car obj= new Car();
		obj.display();
		obj.display2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}

}
