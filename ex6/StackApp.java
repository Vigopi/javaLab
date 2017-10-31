import stack.array.*;
import stack.list.*;
import stack.*;
import java.util.Scanner;
public class StackApp
{
	public static void main(String [] args)
	{
		int choice,choice1,temp;
		Scanner scan=new Scanner(System.in);
		IStackADT stack;
		stack=null;
		do
		{
			System.out.println("**************  STACK APP MENU  ****************");
			System.out.println("   1  -  Array Stack  ");
			System.out.println("   2  -  List Stack  ");
			System.out.println("   Any other key to exit  ");
			System.out.println("************************************************");
			System.out.println(" Enter the choice : ");
			choice=scan.nextInt();	
			if(choice ==1||choice==2)
			{
				if(choice==1)
					stack=new StackArray();	
				else
					stack=new StackList();
				if(stack!=null)
				{
					System.out.println(" Stack is created ");
					do
					{
						System.out.print("\n");
						System.out.println("\t+-+-+-+-+-+-+-+-+- STACK MENU +-+-+-+-+-+-+-+-+-+-");
						System.out.println("\t|  		1 - PUSH          \t\t+");
						System.out.println("\t+  		2 - POP           \t\t|");
						System.out.println("\t| 		3 - Get Top       \t\t+");
						System.out.println("\t+ 		4 - Print Stack   \t\t|");
						System.out.println("\t|		5 - Is Stack Empty\t\t+");
						System.out.println("\t+		6 - Is Stack Full \t\t|");
						System.out.println("\t|		Other key - Main menu \t\t+");
						System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
						System.out.print("\t Enter the choice : ");
						choice1=scan.nextInt();
						System.out.print("\n");
						switch(choice1)
						{
						case 1:
								System.out.print(" Enter the element to push : ");
								temp=scan.nextInt();
								System.out.print("\n");
								if(stack.push(temp))
								{
									System.out.println("\t The element is pushed");
								}
								else
								{
									System.out.println("\t Stack is full, Stack Overflow ");
								}
								System.out.println("\tThe current stack is : \n");
								stack.displayStack();
								break;
							case 2:
								if(stack.pop())
								{
									System.out.println("\t A element is popped");
									System.out.println("\tThe current stack is : \n");
									stack.displayStack();
								}
								else
								{
									System.out.println("\t Stack is Empty, Stack Underflow");
								}
								break;
							case 3:
								if(!stack.isEmpty())
								{
									int ele=stack.top();
									System.out.println("\t The top element is "+Integer.toString(ele));
								}
								else
								{
									System.out.println("\t Stack is Empty");
								}
								break;
							case 4:
								System.out.println("\tThe current stack is : \n");
								stack.displayStack();
								break;
							case 5:
								if(stack.isEmpty())
									System.out.println("\t The stack is Empty ");
								else
									System.out.println("\t The stack is not Empty ");
								break;
							case 6:
								if(stack.isFull())
									System.out.println("\t The stack is Full ");
								else
									System.out.println("\t The stack is not Full ");
								break;	
						}	
					}while(choice1>=1&&choice1<=6);
				}
			}
		}while(choice==1||choice==2);
	System.out.println("\t ------------ T H A N K  Y O U --------------");
	}
}