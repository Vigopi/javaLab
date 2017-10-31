import java.util.*;
public class QueueApp
{
	public static void main(String [] args)
	{
		Scanner sin=new Scanner(System.in);
		int choice1,choice,size;
		do
		{
			System.out.println("--------------- QUEUE ------------------");
			System.out.println("\tInteger Queue - 1");
			System.out.println("\tString Queue - 2 ");
			System.out.println("\tDouble Queue - 3 ");
			System.out.println("\tExit - 4 ");
			System.out.println("-----------------------------------------");
			System.out.print("\tEnter your choice : ");
			choice=sin.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the size of the queue : ");
					size=sin.nextInt();
					Queue <Integer> q=new Queue<Integer>(size);
					do
					{
						System.out.println("--------------- INTEGER QUEUE ------------------");
						System.out.println("\t Enqueue - 1");
						System.out.println("\t Dequeue - 2 ");
						System.out.println("\t Print Queue - 3 ");
						System.out.println("\t go to main menu - 4 ");
						System.out.println("-----------------------------------------");
						System.out.print("\tEnter your choice : ");
						choice1=sin.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter an element to push : ");
								if(q.enqueue(sin.nextInt()))
									System.out.println("The element is enqueued");
								else
									System.out.println("Queue is Full");
								System.out.println(q);
								break;
							case 2:
								Integer a=q.dequeue();
								if(a!=null)
									System.out.println("Dequeued element is : "+Integer.toString(a));
								else
									System.out.println("Queue is EMPTY");
								System.out.println(q);
								break;
							case 3:
								System.out.println(q);
								break;
							case 4:
								break;
							default:
								System.out.println("Enter a valid choice ");
								break;
						}
					}
					while(choice1!=4);
					break;
				case 2:
					System.out.println("Enter the size of the queue : ");
					size=sin.nextInt();
					Queue <String> q1=new Queue<String>(size);
					do
					{
						System.out.println("--------------- STRING QUEUE ------------------");
						System.out.println("\t Enqueue - 1");
						System.out.println("\t Dequeue - 2 ");
						System.out.println("\t Print Queue - 3 ");
						System.out.println("\t go to main menu - 4 ");
						System.out.println("-----------------------------------------");
						System.out.print("\tEnter your choice : ");
						choice1=sin.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter an element to push : ");
								if(q1.enqueue(sin.next()))
									System.out.println("The element is enqueued");
								else
									System.out.println("Queue is Full");
								System.out.println(q1);
								break;
							case 2:
								String a=q1.dequeue();
								if(a!=null)
									System.out.println("Dequeued element is : "+a);
								else
									System.out.println("Queue is EMPTY");
								System.out.println(q1);
								break;
							case 3:
								System.out.println(q1);
								break;
							case 4:
								break;
							default:
								System.out.println("Enter a valid choice ");
								break;
						}
					}
					while(choice1!=4);
					break;
				case 3:
					System.out.println("Enter the size of the queue : ");
					size=sin.nextInt();
					Queue <Double> q2=new Queue<Double>(size);
					do
					{
						System.out.println("--------------- DOUBLE QUEUE ------------------");
						System.out.println("\t Enqueue - 1");
						System.out.println("\t Dequeue - 2 ");
						System.out.println("\t Print Queue - 3 ");
						System.out.println("\t go to main menu - 4 ");
						System.out.println("-----------------------------------------");
						System.out.print("\tEnter your choice : ");
						choice1=sin.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.println("Enter an element to push : ");
								if(q2.enqueue(sin.nextDouble()))
									System.out.println("The element is enqueued");
								else
									System.out.println("Queue is Full");
								System.out.println(q2);
								break;
							case 2:
								Double a=q2.dequeue();
								if(a!=null)
									System.out.println("Dequeued element is : "+Double.toString(a));
								else
									System.out.println("Queue is EMPTY");
								System.out.println(q2);
								break;
							case 3:
								System.out.println(q2);
								break;
							case 4:
								break;
							default:
								System.out.println("Enter a valid choice ");
								break;
						}
					}
					while(choice1!=4);
					break;
				case 4:
					break;
				default:
					System.out.println("Enter a valid choice ");
					break;
			};
		}while(choice!=4);
	}
}