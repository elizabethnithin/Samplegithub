package abstraction;

public class Circle extends Shape {
	
	 double r=5;
	
	public void calculateArea()
	{
		double area= r*(3.145);
		
		System.out.println("Area of circle is :" +area);
	}
	
	public void calculatePerimeter()
	{
		double pr= 2*r*(3.145);
		System.out.println("Perimeter of circle is :" +pr);
	
	}

}
