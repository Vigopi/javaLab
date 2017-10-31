import java.util.ArrayList;
public class FibonacciThread extends Thread
{  
	static int n1=0,n2=1,n3=0; 
	int range;
	ArrayList<Integer> arr;
	FibonacciThread()
	{
		arr=new ArrayList<Integer>();
	}
	FibonacciThread(int range)
	{
		arr=new ArrayList<Integer>();
		this.range=range;
	}
	void Fibonacci(int count){    
		if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;     
         arr.add(n3);
		 Fibonacci(count-1);    
     }    
	}
	public String toString()
	{
		String buffer="";
		for(int i=0;i<arr.size();i++)
		{
			buffer+=Integer.toString(arr.get(i))+" ";
		}
		return buffer;
	}
	public ArrayList<Integer> getArr()
	{
		return arr;
	}
	public void run()
	{
		Fibonacci(range);
	}
}	