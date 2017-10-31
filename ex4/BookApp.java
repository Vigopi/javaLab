import ex4.book.*;
import java.util.Scanner;
public class BookApp
{
	static
	{
		System.out.println("Welcome to my Book Application");
	}
	public static void main(String [] args)
	{
		int choice;
		String title;
		double price;
		int noOfBooks;
		Scanner scan=new Scanner(System.in);
		System.out.print("\t Enter the number of books : ");
		noOfBooks=scan.nextInt();
		Book []books=new Book[noOfBooks];
		for(int i=0;i<books.length;i++)
		{
			System.out.println("----------------------------------------------");
			System.out.print("Enter the title of book "+(i+1)+" : ");
			title=scan.next();
			System.out.print("Enter the price of book "+(i+1)+" : ");
			price=scan.nextDouble();
			System.out.println("----------------------------------------------");
			books[i]=new Book(title,price);
		}
		do
		{
			System.out.println("**************** MENU ****************");
			System.out.println("  1  - Display all books");
			System.out.println("  2  - Display books based on price");
			System.out.println("  3  - Copy");
			System.out.println("  4  - Exit");
			System.out.println("**************************************");
			System.out.print("Enter the choice : ");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("\tId\tTitle\tPrice");
					for(int i=0;i<books.length;i++)
					{
						System.out.println(books[i]);
					}
					break;
				case 2:
					System.out.println("  1  - Below price");
					System.out.println("  2  - Above price");
					System.out.println("  3  - Between prices");
					System.out.print("Enter the choice : ");
					int choice1=scan.nextInt();
					double maxPrice;
					double minPrice;
					if(choice1==1)
					{
						System.out.print("Enter the price amount : ");
						maxPrice=scan.nextDouble();
						System.out.println("\tId\tTitle\tPrice");
						for(int i=0;i<books.length;i++)
						{
							if(books[i].getPrice()<=maxPrice)
							{
									System.out.println(books[i]);
							}
						}
					}
					else if(choice1==2)
					{
						System.out.print("Enter the price amount : ");
						minPrice=scan.nextDouble();
						System.out.println("\tId\tTitle\tPrice");
						for(int i=0;i<books.length;i++)
						{
							if(books[i].getPrice()>=minPrice)
							{
									System.out.println(books[i]);
							}
						}
					}
					else if(choice1==3)
					{
						System.out.print("Enter the minimum price amount : ");
						minPrice=scan.nextDouble();
						System.out.print("Enter the maximum price amount : ");
						maxPrice=scan.nextDouble();
						System.out.println("\tId\tTitle\tPrice");
						for(int i=0;i<books.length;i++)
						{
							if(books[i].getPrice()>=minPrice && books[i].getPrice()<=maxPrice)
							{
								System.out.println(books[i]);	
							}
						}
					}
					break;
				case 3:
					System.out.print("Enter the book Id : ");
					int bookId=scan.nextInt();
					int found=-1;
					for(int i=0;i<books.length;i++)
					{
						if(bookId==books[i].getBookId())
						{
							found=i;
							break;
						}
					}
					if(found>=0)
					{
						System.out.println("\tId\tTitle\tPrice");
						System.out.println(books[found]);
					}
					else
					{
						System.out.println("Book not found");
					}
					break;
				case 4:
					System.out.print(" Exit ");
					break;
				default:
					System.out.print(" Invalid choice ");
					break;
			}
		}while(choice!=4);
		System.out.println("The total number of books created is : "+Book.getNoOfInstanceCreated());
	}
}