import edu.ac.banklib.BankUtil;
import edu.ac.banklib.InitialValues;

/**
 * This class creates 30 bank accounts (Savings and Chequing)
 * @author James for dev
 */

public class BankAccountTest 
{
	/**
	 * Declarations array of 30 bank accounts, 
	 * and initialize deposit in myBankArray.
	 */

    BankAccount[] BankAccountList; 	// object arrays to use in Chequing and Saving account
	private double[] myBankArray = InitialValues.initialDeposit; // initialize deposit in each array
	private int accountNumber; // to put accountNumber in each BankAccountList and Arrays
	
	/**
	 * BankAccountList constructor
	 * @param BankAccountList
	 * 			This object array argument is to allocate memory 
	 * 			to use each 15 accounts as Chequing and Saving
	 */
	public BankAccountTest(BankAccount[] BankAccountList)
	{
		this.BankAccountList = BankAccountList;

		// create 15 element array of chequing account (00~14; AccountNumber: 01 to 15)
		for(accountNumber = 0; accountNumber < myBankArray.length/2; accountNumber++)
		{
			// create subclass object
			BankAccountList[accountNumber] = new ChequingAccount();
			BankAccountList[accountNumber].deposit(myBankArray[accountNumber]);
		}
		
		// create 15 element array of savings account (15~29; AccountNumber: 16 to 30)
		for(accountNumber = myBankArray.length/2; accountNumber < myBankArray.length; accountNumber++)
		{
			// create subclass object
			BankAccountList[accountNumber] = new SavingsAccount();
			BankAccountList[accountNumber].deposit(myBankArray[accountNumber]);
		}
	} // end one-argument BankAccountList constructor
	
	/**
	 * monthlyProcess class is to update for each account
	 * @param myBankArray
 * 				takes an array of bank accounts
	 */
	public void monthlyProcess(BankAccount[] myBankArray)
	{
		// update each array's value 
		for(accountNumber = 0; accountNumber < BankAccountList.length; accountNumber++)
		{
			BankAccountList[accountNumber].calculateAndUpdateBalance();
		}
	} // end one-argument monthlyProcess method
	
	/**
	 * print out; balance and account number with format 
	 * as reference to BankUtil.printBalance
	 */
	public void printBalance()
	{
		for(accountNumber = 0; accountNumber < BankAccountList.length; accountNumber++)
		{
			BankUtil.printBalance(BankAccountList[accountNumber].getClass().getName(), 
					accountNumber+1, BankAccountList[accountNumber].getBalance());
		}
	} // end printBalance method
	
	/**
	 * main source of BankAccountTest
	 * @param args
	 * 			command-line argument
	 */
	public static void main (String args[])
	{
		BankAccount[] myBankAccountList = new BankAccount[30];
		BankAccountTest myBankAccountTest = new BankAccountTest(myBankAccountList);

		for (int countMonthUpdate =0; countMonthUpdate < 12; countMonthUpdate++)
		{
			myBankAccountTest.monthlyProcess(myBankAccountList);
			myBankAccountTest.printBalance();
		}
	} // end main
} // end class BankAccountTest

