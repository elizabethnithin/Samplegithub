package abstraction;

public class MotorCycle extends Car {
	
	public void startEngine()
	{
		System.out.println("MotorCycle is starting");
	}
	
	public void stopEngine()
	{
		System.out.println("MotorCycle is Stopped");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MotorCycle obj = new MotorCycle();
		obj.startEngine();
		obj.stopEngine();
		
		Car obj2 = new Car();
		obj2.startEngine();
		obj2.stopEngine();

	}

}
