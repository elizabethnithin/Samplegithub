package abstraction;

public class Triangle extends Shape {
	
	
	 int b=5;
	 int h=10;
	 int a=5;
	 int c=5;
		
		public void calculateArea()
		{
			int a= b*h;
			
			System.out.println("Area of Triangle is :" +a);
		}
		
		public void calculatePerimeter()
		{
			int p= a+b+c;
			System.out.println("Perimeter of Triangle is :" +p);
		
		}

	public static void main(String[] args) {
		
		Triangle obj = new Triangle();
		obj.calculateArea();
		obj.calculatePerimeter();
		
		Circle obj2= new Circle();
		obj2.calculateArea();
		obj2.calculatePerimeter();

	}

}
