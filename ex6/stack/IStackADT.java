package stack;
public interface IStackADT
{
	public int MAX_SIZE=5;
	public boolean push(int a);
	public boolean pop();
	public boolean isFull();
	public boolean isEmpty(); 
	public int top();
	public void displayStack();
}
