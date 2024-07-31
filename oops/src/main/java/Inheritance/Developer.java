package Inheritance;

public class Developer extends Employee {

	public void dev()
	{
		System.out.println("Developer name is Arjun");
	}
	public static void main(String[] args) {
		Developer obj=new Developer();
		obj.name();
		obj.dev();
		
		Tester obj1=new Tester();
	//	obj1.name();
		obj1.test();
				

	}

}
