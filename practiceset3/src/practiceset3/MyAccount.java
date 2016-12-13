package practiceset3;


import java.util.Date;

public class MyAccount 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public MyAccount()
	{
		super();
	}
	public MyAccount(int id, double balance)
	{
		super();
		this.id=id;
		this.balance=balance;
		
	}
	public int getID()
	{
		return id;
		
	}
	public void setID(int id)
	{
		this.id=id;
		
	}
	public double getBALANCE()
	{
		return balance;
		
	}
	public void setBALANCE(double balance)
	{
		this.balance=balance;
		
	}
	public double getANNUALINTERESTRATE()
	{
		return annualInterestRate;
		
	}
	public void setANNUALINTERESTRATE(double annualInterestRate)
	{
		this.annualInterestRate=annualInterestRate;
		
	}
	public Date getDATECREATED()
	{
		return dateCreated;
		
	}
	public double getMONTHLYRATE()
	{
		return (annualInterestRate)/12;
		
	}
	public void withdraw (double Money) throws InsufficientFundsException
	{
		if (Money <= balance)
		{
			balance -= Money;
		}
		else
		{
			double needs = Money - balance;
			throw new InsufficientFundsException(needs);
			
		}
	}
	public void deposit (double paycheck)
	{
		balance += paycheck;
	}
	
}
