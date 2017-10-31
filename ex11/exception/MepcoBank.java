import java.util.Scanner;
public class MepcoBank
{
	public static void main(String []args)
	{
		String accNo,accHolder;
		float balance,amt;
		System.out.println("* * * * * * * * * * Welcome to MepcoBank * * * * * * * * * * * * * * * * *");
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the account number");
		accNo=sin.next();
		System.out.println("Enter the account holder");
		accHolder=sin.next();
		System.out.println("Enter the balance amount");
		balance=sin.nextFloat();
		Account acc=new Account(accNo,accHolder,balance);
		int choice;
		do
		{
			System.out.println("----------- Account Menu ------------");
			System.out.println("|\t1 - Deposit");
			System.out.println("|\t2 - Withdraw");
			System.out.println("|\t3 - Check Balance");
			System.out.println("|\t4 - Exit");
			System.out.println("-------------------------------------");
			System.out.print("Enter your choice : ");
			choice=sin.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter the amount to deposit : ");
					amt=sin.nextFloat();
					try
					{
						acc.deposit(amt);
						System.out.println("Amount deposited");
					}
					catch(DepositOverflowException e)
					{
						System.out.println("SORRY!,Deposit amount must not exceeds 10,000");
					}
					finally
					{
						System.out.println("Your account balance is "+Float.toString(acc.getBalance()));
					}
					break;
				case 2:
					System.out.print("Enter the amount to withdraw : ");
					amt=sin.nextFloat();
					try
					{
						acc.withdraw(amt);
						System.out.println("Amount withdrawn successfully");
					}
					catch(LessBalanceException e)
					{
						System.out.println("SORRY!,low balance");
					}
					finally
					{
						System.out.println("Your account balance is "+Float.toString(acc.getBalance()));
					}
					break;
				case 3:
					System.out.println("Account number : "+acc.getAccNo());
					System.out.println("Account Holder : "+acc.getAccHolder());
					System.out.println("Your account balance is "+Float.toString(acc.getBalance()));
					break;
				case 4:
					break;
				default:
					System.out.println("Please enter a valid option");
					break;
			}
		}while(choice!=4);
		System.out.println("* * * * * * * * * * * * * Thank You Visit Again * * * * * * * * * * * * * * ");
	}
}