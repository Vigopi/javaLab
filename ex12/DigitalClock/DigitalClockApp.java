public class DigitalClockApp
{
	public static void main(String []args)
	{
		Time t1=new Time();
		DigitalClockThread clkThread=new DigitalClockThread(t1);
		clkThread.start();
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Thread exception");
			}
			System.out.println(t1);
		}
	}
}