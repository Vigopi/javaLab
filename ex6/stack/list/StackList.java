package stack.list;
import stack.*;
import stack.list.Node;
import java.lang.StringBuilder;
public class StackList implements IStackADT
{
	Node top;
	int count;
	{
		count=0;
	}
	public boolean push(int x)
	{
		if(!isFull())
		{
			Node newNode=new Node(x);
			if(isEmpty())
			{
				this.top=newNode;
			}
			else
			{
					newNode.next=top;
					top=newNode;
			}
			count++;
			return true;
		}
		else
			return false;
	}
	public boolean pop()
	{
		if(!isEmpty())
		{
			Node temp=top;
			top=top.next;
			temp=null;
			count--;
			return true;
		}
		else
			return false;
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	public boolean isFull()
	{
		return count==IStackADT.MAX_SIZE;
	}
	public int top()
	{
		if(!isEmpty())
		{
			return top.getElement();
		}
		else
		{
			return -1;
		}
	}
	public String toString()
	{
		if(!isEmpty())
		{
			StringBuilder strBuild=new StringBuilder();
			Node temp=top;
			while(temp!=null)
			{
				strBuild.append(Integer.toString(temp.getElement())+' ');
				temp=temp.next;
			}
			return strBuild.toString();
		}
		else
		{
			return "The Stack is Empty";
		}
	}
	public void displayStack()
	{
		System.out.println(" |------|");
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(" |  "+temp.getElement()+"  | ");
			System.out.println(" |------|");
			temp=temp.next;
		}	
	}
}