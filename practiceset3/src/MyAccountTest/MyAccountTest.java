package MyAccountTest;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import playsation3slim.MyAccount;

public class MyAccountTest 
	{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	
	}
	
	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	@After
	public void tearDown() throws Exception 
	{
		
	}
	
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException 
	{
		MyAccount testMyAccount = new MyAccount();
		
		testMyAccount.setID(5);			
		testMyAccount.setBALANCE(500);	
	
		testMyAccount.withdraw(600);
	}
	
	@Test
	public void testMyAccount() throws InsufficientFundsException 
	{
		int idNumber = 1122;
		double balance = 20000;
		double withdraw = 2500;
		double deposit = 3000;
		double AnnualInterest = 4.5;
		
		MyAccount testMyAccount = new MyAccount(idNumber, balance);
		testMyAccount.setAnnualInterestRate(AnnualInterest);
		assertEquals(testMyAccount.getAnnualInterestRate(), AnnualInterest,.001);
	
		assertEquals(testMyAccount.getId(), idNumber, 0);
		
		double TakeOutMoney = balance - withdraw;
		testMyAccount.withdraw(withdraw);
		assertEquals(testMyAccount.getBalance(), TakeOutMoney, .001);
		
		double moneyInTheBank = balance - withdraw + deposit;
		testMyAccount.deposit(deposit);
		assertEquals(testMyAccount.getBalance(), moneyInTheBank, .001);
		
		System.out.println("Balance: $" + testMyAccount.getBalance());
		System.out.println("Monthly Interest Rate: " +testMyAccount.getMonthlyRate() +"%");
		System.out.println("Date Created: " + testMyAccount.getDateCreated());

	}
}
