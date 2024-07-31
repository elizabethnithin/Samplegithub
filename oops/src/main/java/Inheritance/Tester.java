package Inheritance;

public class Tester extends Employee {

	public void test()
	{
		System.out.println("Tester name is Joe");
	}
	public static void main(String[] args) 
	{
		Tester obj1=new Tester();
		obj1.name();
		obj1.test();
		
	}
}
