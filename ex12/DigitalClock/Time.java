public class Time
{
	int seconds;
	int minutes;
	int hours;
	Time()
	{
		this.seconds=0;
		this.minutes=0;
		this.hours=0;
	}
	Time(int hours,int sec,int min)
	{
		this.seconds=sec;
		this.minutes=min;
		this.hours=hours;
	}
	public void incrementHours()
	{
		this.hours++;
	}
	public void incrementMinutes()
	{
		this.minutes++;
	}
	public void incrementSeconds()
	{
		this.seconds++;
	}
	public void decrementHours()
	{
		this.hours++;
	}
	public void decrementMinutes()
	{
		this.minutes++;
	}
	public void decrementSeconds()
	{
		this.seconds++;
	}
	void setHours(int hours)
	{
		this.hours=hours;
	}
	int getHours()
	{
		return this.hours;
	}
	void setMinutes(int minutes)
	{
		this.minutes=minutes;
	}
	int getMinutes()
	{
		return this.minutes;
	}
	void setSeconds(int seconds)
	{
		this.seconds=seconds;
	}
	int getSeconds()
	{
		return this.seconds;
	}
	public String toString()
	{
		return "\t"+Integer.toString(hours)+" : "+Integer.toString(minutes)+" : "+Integer.toString(seconds);
	}
}