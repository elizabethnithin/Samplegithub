package AccessModifier1;

public class ModifierSample {

	protected int a=10;
	protected void display()
	{
		System.out.println(a);

	}
	
	public static void main (String args[])
	{
		ModifierSample obj=new ModifierSample();
		obj.display();
	}

}
