import java.util.ArrayList;
import java.util.Scanner;
public class MyApp
{
	public static void main(String []args)
	{
		Scanner sin=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int range=sin.nextInt();
		PrimeThread pThread=new PrimeThread(range);
		FibonacciThread fThread=new FibonacciThread(range);
		pThread.start();
		fThread.start();
		try
		{
		pThread.join();
		fThread.join();
		}
		catch(Exception e)
		{
			System.out.println("Thread Exception");
		}
		ArrayList<Integer> arr1=pThread.getArr();
		ArrayList<Integer> arr2=fThread.getArr();
		//int []ar1=arr1.toArray();
		//int []ar2=arr2.toArray();
		//System.out.println("The prime numbers are "+pThread);
		//System.out.println("The fibonacci numbers are "+fThread);
		for(int i=0;i<arr1.size();i++)
		{
			if(arr2.contains(arr1.get(i)))
				System.out.println(Integer.toString(arr1.get(i))+"\n");
		}
	}
}