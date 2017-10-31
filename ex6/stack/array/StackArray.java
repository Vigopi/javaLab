package stack.array;
import stack.*;
import java.lang.StringBuilder;
public class StackArray implements IStackADT
{
	int []stack;
	int top;
	public StackArray()
	{
		top=-1;
		stack=new int[IStackADT.MAX_SIZE];
	}
	public boolean isFull()
	{
		return this.top==IStackADT.MAX_SIZE-1;
	}
	public boolean isEmpty()
	{
		return this.top==-1;
	}
	public int top()
	{
		if(!isEmpty())
			return stack[top];
		else
			return -1;
	}
	public boolean push(int element)
	{
		if(!isFull())
		{
			top++;
			stack[top]=element;
			return true;
		}
		else
			return false;
	}
	public boolean pop()
	{
		if(!isEmpty())
		{
			top--;
			return true;
		}
		else
			return false;		
	}
	public String toString()
	{
		if(isEmpty())
			return "The Stack is Empty";
		else
		{
			StringBuilder strBuild=new StringBuilder();
			for(int i=0;i<=top;i++)
			{
				int temp=stack[i];
				strBuild.append(Integer.toString(temp)+' ');
			}
			return strBuild.toString();
		}
	}
	public void displayStack()
	{
		System.out.println(" |------|");
		for(int i=top;i>=0;i--)
		{
			System.out.println(" |  "+stack[i]+"  | ");
			System.out.println(" |------| ");
		}
	}
}
