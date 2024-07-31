package polymorphism;

public class Football extends Game {
	
	public void play()
	{
		
		System.out.println("Playing Football");
		
	}

	public static void main(String[] args) 
	{
		Game obj = new Game();
		obj.play();
		
		obj= new Football();
		obj.play();
		
		obj= new Cricket();
		obj.play();
		
		obj= new Hocky();
		obj.play();
		
		
	}

}
