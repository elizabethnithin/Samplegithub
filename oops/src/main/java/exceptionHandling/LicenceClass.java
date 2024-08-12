package exceptionHandling;

public class LicenceClass {
	
 public static void licence (int age) throws CustomExcepion
 {
	 if(age<18)
	 {
		 throw new CustomExcepion("Not valid for licence");
	 }
	 else
	 {
		 System.out.println("valid for licence");
	 }
	 
 }

	public static void main(String[] args)
	{
		try
		{
			LicenceClass.licence(2);
		}
		
		catch(CustomExcepion e)
		{
			System.out.println(e);
		}
		
		System.out.println("Rest of the code");  

	}

}
