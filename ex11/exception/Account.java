public class Account
{
	String accNo;
	String accHolder;
	float balance;
	Account()
	{}
	Account(String no,String name,float bal)
	{
		this.accNo=no;
		this.accHolder=name;
		this.balance=bal;
	}
	float getBalance()
	{
		return this.balance;
	}
	void setBalance(float bal)
	{
		this.balance=bal;
	}
	String getAccNo()
	{
		return this.accNo;
	}
	String getAccHolder()
	{
		return this.accHolder;
	}
	public void deposit(float amt) throws DepositOverflowException
	{
		if(amt>10000)
			throw new DepositOverflowException();
		else
			this.setBalance(balance+amt);
	}
	public void withdraw(float amt) throws LessBalanceException
	{
		if(amt>=balance)
			throw new LessBalanceException();
		else
			this.setBalance(balance-amt);
	}
}
class DepositOverflowException extends Exception
{
	DepositOverflowException()
	{}
	DepositOverflowException(String msg)
	{
		super(msg);
	}
}
class LessBalanceException extends Exception
{
	LessBalanceException()
	{}
	LessBalanceException(String msg)
	{
		super(msg);
	}
}