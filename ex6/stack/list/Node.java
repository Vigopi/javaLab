package stack.list;
public class Node
	{
		private int element;
		Node next;
		Node()
		{
			element=0;
			next=null;
		}
		Node(int x)
		{
			element=x;
			next=null;
		}
		public int getElement()
		{
			return element;
		}
	}