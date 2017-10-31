import java.util.ArrayList;
public class PrimeThread extends Thread
{   
	int range;
	ArrayList<Integer> arr;
	PrimeThread()
	{
		arr=new ArrayList<Integer>();
	}
	PrimeThread(int range)
	{
		arr=new ArrayList<Integer>();
		this.range=range;
	}
	public ArrayList<Integer> getArr()
	{
		return arr;
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
	private static boolean isPrime(int n) {
        if (n % 2 == 0) 
            return false;
        for (int i = 3; i*i <= n; i += 2)
            if (n % i == 0) 
                return false;
        return true;
    }
	void prime(int count)
	{
		for(int i=1;i<=count;i++)
		{
			if(isPrime(i))
				arr.add(i);
		}
	}
	public void run()
	{
		prime(range);
	}
}	