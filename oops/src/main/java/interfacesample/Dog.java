package interfacesample;

public class Dog implements Animal {
	
	
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
	
	
/*	public void speak()
	{
		System.out.println("Dog is Barking");
	} */  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Dog();
		obj.bark();			
	}

}
