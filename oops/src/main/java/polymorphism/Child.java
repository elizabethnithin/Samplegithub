package polymorphism;

public class Child extends Parent {
	
	public void sum(int c,int d)
	{
		int sum=c+d;
		System.out.println("child sum : " +sum);
		super.sum(50,60);
	}

	public static void main(String[] args) 
	{
		Child obj= new Child();
		obj.sum(10,20);
		

	}

}
