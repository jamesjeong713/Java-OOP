import edu.ac.banklib.InitialValues;

/**
 * This class calculate chequing account in format
 * it is subclass of BankAccount
 * @author James for dev
 */
public class ChequingAccount extends BankAccount 
{

	// variables for monthly
	private double fee = InitialValues.feePerMonth; //initialize InitialValues.feePerMonth to fee variable
	private double balance;
	
	/**
	 * return double balance
	 * @return it return balance of ChequingAccount
	 */
	@Override
	public double getBalance() 
	{	
		return balance;
	} 
	
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
	}
	
	/**
	 * calculate and update balance; 
	 * override abstract method calculateAndUpdateBalance in BankAccount
	 */
	@Override
	public void calculateAndUpdateBalance() 
	{
		// subtract the fee to balance
		balance = balance - fee;
	}
}
