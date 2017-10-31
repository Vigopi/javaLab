public class DigitalClockThread extends Thread
{
	Time t;
	DigitalClockThread()
	{}
	DigitalClockThread(Time x)
	{
		t=x;
	}
	public void run()
	{
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
			t.incrementSeconds();
			if(t.getSeconds()>59)
			{
				t.setSeconds(0);
				t.incrementMinutes();
			}
			if(t.getMinutes()>59)
			{
				t.setMinutes(0);
				t.incrementHours();
			}
			if(t.getHours()>24)
			{
				t.setHours(0);
				t.setMinutes(0);
				t.setSeconds(0);
			}
		}
	}
}