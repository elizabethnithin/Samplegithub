package exceptionHandling;

public class ThrowEception {
	
	public static  void sum(int a, int b)
	{
		int sum=a+b;
		
		if (sum>20)
		{
			throw new ArithmeticException("sum is greater than 20");
			
		}
		
		else
		{
			System.out.println("Not greater than 20");
		}
	}

	public static void main(String[] args) 
	{
	
		try
		{
			ThrowEception.sum(20,20 );
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		
		System.out.println("Rest of the code");

	}

}
