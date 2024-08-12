package Encapsulation;

public class Car {
	
	private String company_name;
	private String model_name;
	private int year;
	private int milege;
	

	public void setter(String company_name,String model_name, int year)
	{
		this.company_name=company_name;
		this.model_name=model_name;
		this.year=year;
				
	}
	
	public void getter()
	{
		System.out.println("Company name is :" +company_name);
		System.out.println("Model name is :" +model_name);
		System.out.println("Car year :" +year);
		
	}
	
/*	public void setMilege(int milege)
	{
		this.milege = milege;
	}*/
	
	public void getMilege()
	{
		System.out.println("Car milege :" +milege);	
	}

	

}
