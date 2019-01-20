/**
 * This class is superclass of ChequingAccount and SavingsAccount
 * @author James for dev
 *
 */
public abstract class BankAccount implements edu.ac.banklib.BankInterface  
{

	private double balance;
	
	/**
	 * return double balance
	 * @return it returns balance of SavingsAccount
	 */

	public double getBalance() 
	{
		return balance;
	}

	/**
	 * override abstract method deposit in BankAccount
	 * @param initialDeposit
	 * 			parameter in format
	 */

	public void deposit(double initialDeposit) 
	{

	}
	
	/**
	 * this abstract method must be overridden by concrete subclasses 
	 * which is SavingsAccount and ChequingAccount
	 */
	abstract public void calculateAndUpdateBalance(); // no implement
} // end abstract class BankAccount
