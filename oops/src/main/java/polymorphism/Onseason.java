package polymorphism;

public class Onseason extends Offseason {
	
	double disc;
	public void discount(int a)
	
	{
		super.discount(1000);
		disc=0.15*a;
		
		System.out.println("Discount on Onseason is :" +disc);
	}
	
	public static void main (String args[])
	{
		Onseason obj = new Onseason();
		obj.discount(1000);
		
	}

}
 