package Inheritance;

public class Total extends Calculate {
	
	
	public void TotalSalary()
	{
		double Total= basic+hra-pf-deduction+bonus;
		System.out.println("Total Salary : " +Total);
		System.out.println("Salary Slip");
		System.out.println("basic pay : " +basic);
		System.out.println("hra : " +hra);   
		System.out.println("Deduction : " +deduction);   
		System.out.println("Bonus : " +bonus);   
		System.out.println("PF : " +pf);
	}
	

	public static void main(String[] args) {
		Total obj = new Total();
		obj.display();
		obj.Calculation();
		obj.TotalSalary();
		
		

	}

}
