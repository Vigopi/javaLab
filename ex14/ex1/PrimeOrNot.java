import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scan.nextInt();
		boolean flag=true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
			System.out.println("The number "+number+" is not a Prime number");
		else
			System.out.println("The number "+number+" is a Prime number");
	}
}