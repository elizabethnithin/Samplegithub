package exceptionHandling;

public class UncheckedException {
	
	public static void check() throws ArithmeticException
	
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UncheckedException.check();

	}

}
