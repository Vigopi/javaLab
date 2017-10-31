import java.lang.reflect.*;
import java.util.*;
public class MyAnalyzeApp
{
	public static void main(String[] args)
	{
	  String name;
	  if(args.length>0)
		  name=args[0];
	  else
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.print("Enter the class name : ");
		  name=scan.next();
	  }
	  analyzeClass(name);
	}
	  public static void analyzeClass(String classStr)
  {
	try
	{
		Class cl=Class.forName(classStr);
		Class supercl=cl.getSuperclass();
		String modifiers=Modifier.toString(cl.getModifiers());
		if(modifiers.length()>0)
		  System.out.print(modifiers+" ");
		System.out.print("class "+cl.getName());
		if(supercl!=null && supercl!=Object.class)
		  System.out.print(" extends "+supercl.getName());
		System.out.print("\n{\n");
		printConstructors(cl);
		System.out.print("\n");
		printMethods(cl);
		System.out.print("\n");
		printFields(cl);
		System.out.println("}");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
  }
  public static void printConstructors(Class cl)
  {
	  Constructor[] constructors=cl.getDeclaredConstructors();
	  for(Constructor c:constructors)
      {
		String name=c.getName();
		System.out.print("  ");
		String modifiers=Modifier.toString(c.getModifiers());
		if(modifiers.length()>0)
		  System.out.print(modifiers+" ");
		System.out.print(name+"(");
		Class[] paramTypes=c.getParameterTypes();
		for(int j=0;j<paramTypes.length;j++)
		{
		  if(j>0)
           System.out.print(", ");
          System.out.print(paramTypes[j].getName());	   
		}
		System.out.println(");");
	  }
  }
  public static void printMethods(Class cl)
  {
	Method[] methods=cl.getDeclaredMethods();
    for(Method m:methods)
    {
	  Class retType=m.getReturnType();
	  String name=m.getName();
	  System.out.print(" ");
	  String modifiers=Modifier.toString(m.getModifiers());
	  if(modifiers.length()>0)
	    System.out.print(modifiers+" ");
	  System.out.print(retType.getName()+" "+name+"(");
	  Class []paramTypes=m.getParameterTypes();
	  for(int j=0;j<paramTypes.length;j++)
		{
		  if(j>0)
           System.out.print(", ");
		   System.out.print(paramTypes[j].getName());
		}
		System.out.println(");");
	}		
  }
  public static void printFields(Class cl)
  {
	Field[] fields=cl.getDeclaredFields();
    for(Field f:fields)
    {
	  Class type=f.getType();
	  String name=f.getName();
	  System.out.print(" ");
	  String modifiers=Modifier.toString(f.getModifiers());
	  if(modifiers.length()>0)
	    System.out.print(modifiers+" ");
	  System.out.println(type.getName()+" "+name+";");
	}		
  }
}
