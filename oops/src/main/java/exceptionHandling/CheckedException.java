package exceptionHandling;
import java.io.IOException;

public class CheckedException
{
	
	public static void check () throws IOException
	{
		throw new IOException();
	}


	public static void main(String[] args) throws IOException
	{
		CheckedException.check();
	}

}
