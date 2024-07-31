package Inheritance;
import java.util.*;

public class Basic {
	
	double basic;
	double bonus;
	double deduction;
	
	public void display()
	{
	/*	basic = 30000;
		bonus = 5000;
		deduction = 2000;  */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Basic pay");
		basic=sc.nextDouble();
		
		System.out.println("Enter your bonus");
		bonus=sc.nextDouble();
		
		System.out.println("Enter your deduction");
		deduction=sc.nextDouble(); 
		
		}

}
