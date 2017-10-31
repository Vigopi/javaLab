package stack.array;
import stack;
public class StackArray implements IStackADT
{
	int []stack;
	int top;
	StackArray()
	{
		top=-1;
		stack=new int[IStackADT.MAX_SIZE];
	}
	public boolean isFull()
	{
		return this.top==IStackADT.MAX_SIZE;
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
	public void push(int element)
	{
		if(!isFull())
			array[++top]=element;
	}
	public void pop()
	{
		if(!isEmpty())
			top--;
	}
}
