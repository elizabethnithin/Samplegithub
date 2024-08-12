package Encapsulation;

public class Employee {
	
	private String name;
	private String designation;
	private int salary;
	
	public void setter(String name ,String designation, int salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void getter()
	{
		System.out.println("Emplyee name is :"+name);
		System.out.println("Emplyee designation is :"+designation);
		System.out.println("Emplyee salary is :"+salary);
		
	}
	
	

}
