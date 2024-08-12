package exceptionHandling;

public class SampleException {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=20;
		int sum= a+b;
		
		System.out.println("sum Result is " +sum);
		
		int arr[]= new int [5];
		
		//int result =sum/0;
		//arr[9]=50;
		
		try
		{
			arr[9]=50;	// Try should be only one
			int result =sum/0;
		}
		
	/*	catch(ArithmeticException e)  // multi catch
		{
			System.out.println("division by zero is not possible");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is 5");
		} 
		
		catch(Exception e)
		{
			System.out.println(e);
		} */
		
		
		finally
		{
			System.out.println("Final block will always execute");
		}
		
		System.out.println("rest of code");
		
	}

}
