import java.util.Scanner;
class TriadNumber
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1=scan.nextInt();
		System.out.print("Enter second number : ");
		int num2=scan.nextInt();
		System.out.print("Enter third number : ");
		int num3=scan.nextInt();
		boolean n1=isThreeDigit(num1);
		boolean n2=isThreeDigit(num2);
		boolean n3=isThreeDigit(num3);
		if(n1==true&&n2==true&&n3==true)
		{
			n1=isOneOccurance(num1);
			n2=isOneOccurance(num2);
			n3=isOneOccurance(num3);
			if(n1==true && n2==true && n3==true)
			{
				if(num2==num1*2&&num3==num1*3)
					System.out.println("The numbers are TRIAD numbers");
				else
					System.out.println("Multiplication rule not satisfied");
			}
			else
			{
				System.out.println("Multiple occurance of a digit in a number");
			}
		}
		else
		{
			System.out.println("Not a Three digit numbers");
		}
	}
	public static boolean isThreeDigit(int number)
	{
		if(number>=100&&number<=999)
			return true;
		else
			return false;
	}
	public static boolean isOneOccurance(int number)
	{
		int dig1=number%10;
		number/=10;
		int dig2=number%10;
		number/=10;
		int dig3=number%10;
		number/=10;
		if(dig1!=dig2&&dig2!=dig3&&dig3!=dig1)
			return true;
		else
			return false;
	}
}