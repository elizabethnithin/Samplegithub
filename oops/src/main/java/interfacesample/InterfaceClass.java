package interfacesample;

public class InterfaceClass implements Interface1,Interface2 {
	
	public void display()
	{
		System.out.println("Interface 1 sample is : " +A );
		
	}
	
	public void display2()
	{
		System.out.println("Interface 2 sample is : " +B );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceClass obj= new InterfaceClass();
		  obj.display();
		  obj.display2();
		  
	
		  

	}

}
