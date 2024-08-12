package abstraction;

public class Federal extends Bank {

	public void intrest()
	{
		System.out.println("Federal Bank Intrest rate is 20%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Federal obj = new Federal();
		obj.intrest();
		
		Icc obj2 = new Icc();
		obj2.intrest();
		
		Hdfc obj3 = new Hdfc();
		obj3.intrest();
	}

}
