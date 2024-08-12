package abstraction;

public class Abs extends Sample
{
	
	public void display()
	{
		System.out.println(" abstarct method");
		
		
	}
	
	public void print1()
	{
		System.out.println("Sample second method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abs obj =new Abs();
		obj.display();
		obj.print();
		obj.print1();
		

	}

}
