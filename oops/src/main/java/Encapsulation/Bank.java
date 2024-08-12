package Encapsulation;


public class Bank {
	
	private int pin;
	
	public void setter(int pin)
	{
		this.pin=pin;
		
	}
	
	public void getter()
	{
		System.out.println("ATM pin is " +pin   );
	}
	
	public void validate()
	
	{
		if (pin == 1001 || pin == 1234 || pin == 1212) 
		{
			System.out.println("Pin is valid");
		}
		else 
		{
			System.out.println("Pin is not valid");
		}
}
}
