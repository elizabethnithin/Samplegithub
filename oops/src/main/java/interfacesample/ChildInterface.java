package interfacesample;

public class ChildInterface implements Interface
{
	public void display()
	{
		System.out.println("Sample interface");
		
	}
	
	public void display2()

	{
		System.out.println("Sample interface method2");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface obj= new ChildInterface();
		obj.display();
		obj.display2();  

	}

}
