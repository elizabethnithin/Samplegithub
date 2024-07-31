package SuperKeyword;

public class Division extends Addition
{
	int div;
	public void div()
	{
		super.sum(1,20);
		
		System.out.println("Result of sum is " +s);
		
		div=s%10;
		
		if(div==0)
		{
			System.out.println("Number is div by 10");
		}
		
		else
		{
			System.out.println("Number is not div by 10");
		}
	}
	public static void main(String[] args) {
		
		Division obj = new Division();
		obj.div();

	}

}
