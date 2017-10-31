import java.util.*;
class CarApp
{
	public static void main(String [] args)
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of cars : ");
		n=scan.nextInt();
		Car []carList=new Car[n];
		int carNo,price;
		String modelName,make,color;
		for(int i=0;i<carList.length;i++)
		{
			carList[i]=new Car();
			System.out.println("Enter the car number of car "+(i+1)+" : ");
			carNo=scan.nextInt();
			System.out.println("Enter the model name of car "+(i+1)+" : ");
			modelName=scan.next();
			System.out.println("Enter the maker of car "+(i+1)+" : ");
			make=scan.next();
			System.out.println("Enter the price of car "+(i+1)+" : ");
			price=scan.nextInt();
			System.out.println("Enter the color of car "+(i+1)+" : ");
			color=scan.next();
			carList[i].setDetails(carNo,modelName,make,price,color);
			System.out.println("\n");
		}	
		int choice;
		do
		{
			System.out.println("---------------------------------  MENU  ---------------------------------");
			System.out.println("   1	-	Display all car details");
			System.out.println("   2	-	Display the car details having price greater than ₹9,00,000");
			System.out.println("   3	-	Display thr car details of TATA cars");
			System.out.println("   4	-	copy a car details ");
			System.out.println("   5	-	Exit");
			System.out.println("--------------------------------------------------------------------------\n");
			System.out.print("   Enter the choice from menu : ");
			choice=scan.nextInt();
			if(choice==1)
			{
				System.out.println("\n\tCar number\tModel\tmake\tprice INR\tcolor\n");
				for(int i=0;i<carList.length;i++)
				{
					carList[i].displayCarDetails();
				}
			}
			else if(choice==2)
			{
				System.out.println("\n\tCar number\tModel\tmake\tprice INR\tcolor\n");
				for(int i=0;i<carList.length;i++)
				{
					if(carList[i].getPrice()>900000)
						carList[i].displayCarDetails();
				}
			}
			else if(choice==3)
			{
				System.out.println("\n\tCar number\tModel\tmake\tprice INR\tcolor\n");
				for(int i=0;i<carList.length;i++)
				{
					if((carList[i].getMake()).equals("TATA"))
						carList[i].displayCarDetails();
				}
			}
			else if(choice==4)
			{
				int index;
				Car c=new Car();
				System.out.print("\tEnter the car to copy : ");
				index=scan.nextInt()-1;
				if(index>=0&&index<=carList.length)
				{
					c=carList[index].copy();
					System.out.println("\tThe car details are copied");
					System.out.println("\n\tCar number\tModel\tmake\tprice INR\tcolor\n");
					c.displayCarDetails();
				}
				else
					System.out.println("\t Car not exist");
			}
			else if(choice!=5)
			{
				System.out.println(" Please enter a valid choice ");
			}
		}while(choice!=5);
		
	}
}