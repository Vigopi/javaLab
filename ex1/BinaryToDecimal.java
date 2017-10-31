import java.util.Scanner;
class BinaryToDecimal
{
	public static void main(String[] arg)
	{
		int x;
		boolean status=true;
		int decimal=0;
		System.out.println("Enter a binary number ");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int num=number;
		int num1=number;
		int temp=number;
		while(temp!=0)
		{

			x=number%10;
			number=number/10;
			if(x>1)
			{
				System.out.println("Error,The number is not a binary number");
				status=false;				
				break;
			}
			temp=temp/10;
		}
		temp=num;
		if(status==true)
		{
			int place=0;
			while(temp!=0)
			{
				x=temp%10;
				decimal=decimal+(int)(x*Math.pow(2,place));
				place=place+1;
				temp=temp/10;
			}
			System.out.println("The decimal equivalent of "+num1+" is "+decimal+" ");
		}
	}
}
