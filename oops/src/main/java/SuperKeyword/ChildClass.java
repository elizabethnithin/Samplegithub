package SuperKeyword;

public class ChildClass extends ParentClass {

		String color="black";
		
	
		public void display()
		{
			super.display();
			super.detail();
			System.out.println(super.color);
			
			System.out.println("child class dispaly");
			System.out.println(color);
		}
		
		public ChildClass()
		{
			super();
			System.out.println("Child constructor");
		}
		
	
	public static void main(String[] args) {
		
	ChildClass obj = new ChildClass();
	obj.display();
	

	}

}
