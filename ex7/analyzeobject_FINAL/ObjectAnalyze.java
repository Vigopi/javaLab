import java.lang.reflect.*;
public class ObjectAnalyze
{
	public static void main(String []args)
	{
		CommissionEmployee c=new CommissionEmployee(100,1000.0,1,"Vinothgopi");
		System.out.println(toString(c));
	}
	public static String toString(Object obj)
	{
		String temp="";
		Class cls=obj.getClass();
		temp+=cls.getName()+"[ ";
		Field []f=cls.getDeclaredFields();
		try
		{
		for(int i=0;i<f.length;i++)
		{
			temp+=f[i].getName()+"=";
			f[i].setAccessible(true);
			temp+=f[i].get(obj).toString()+", ";
		}
		}
		catch(Exception e)
		{
		}
		temp+="]";
		return temp;
	}
}