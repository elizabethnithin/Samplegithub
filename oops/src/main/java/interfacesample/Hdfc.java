package interfacesample;

public class Hdfc implements RBI {
	

	double intrestamount;
	
	
	public void recurringDeposit(double A, double T)
	{
		intrestamount= A*I*T;
		double tot= intrestamount+A;
		
		System.out.println("Intrest after depositing is: " +intrestamount);
		
		System.out.println("amount after depositing is: " +tot);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI obj= new Hdfc();
		obj.recurringDeposit(10000.0,2.0);
		

	}

}
