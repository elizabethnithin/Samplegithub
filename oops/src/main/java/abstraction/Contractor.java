package abstraction;

public class Contractor extends Employee {
	
	int ph; //per hour
	int hr; //total hour
	int tot;
	int full;
	
	public void calculateSalary(int ph, int hr)
	{
		tot = ph*hr;
		full= 8*ph;
		System.out.println("Per hour salary of Employee is :"+ph);
		System.out.println("salary of employee based on given hours is : "+tot);     
		System.out.println("Full Time salary of Employee based on 8 hour is : "+full); 
		 
	}
	
/*	public void calculateSalary(int ph)
	{
		tot=8*ph;
		System.out.println("Full Time salary of Employee based on 8 hour is : "+tot); 
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contractor obj= new Contractor();
		obj.calculateSalary(20,5);
	//obj.calculateSalary(30);

				

	}

}
