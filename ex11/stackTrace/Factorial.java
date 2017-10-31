import java.util.*;
public class Factorial
{
	public int factorial(int number)
	{
		System.out.println("Factorial ("+Integer.toString(number)+")");
		Throwable t=new Throwable();
		StackTraceElement []ste=t.getStackTrace();
		for(int i=0;i<ste.length;i++)
		{
			System.out.println(ste[i]);
		}
		if(number<=1)
			return 1;
		else
			return number*factorial(number-1);
	}
}
