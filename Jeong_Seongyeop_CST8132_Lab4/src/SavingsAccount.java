import edu.ac.banklib.InitialValues;

/**
 * This class calculate savings account in format
 * it is subclass of BankAccount
 * @author James for dev
 */
public class SavingsAccount extends BankAccount 
{

	// variables for yearly
	private double interestRate = InitialValues.interestRate; //initialize InitialValues.interestRate to interestRate variable
	private double balance;
	
	/**
	 * return double balance
	 * @return it returns balance of SavingsAccount
	 */
	@Override
	public double getBalance() 
	{
		return balance;
	} // end getBalance method
	

	/**
	 * override abstract method deposit in BankAccount
	 * @param initialDeposit
	 * 			calculate deposit; double balance adding initialDeposit
	 */
	@Override
	public void deposit(double initialDeposit)
	{
		// add each element's value to balance
		balance = balance + initialDeposit;
	} // end one-argument initialDeposit method
	 
	/**
	 * calculate and update balance; 
	 * override abstract method calculateAndUpdateBalance in BankAccount
	 */
	@Override
	public void calculateAndUpdateBalance() 
	{
		//add the interest for the month to balance
 		balance = balance + balance * (interestRate/12);
	} // end calculateAndUpdateBalance method
} // end SavingsAccount class
