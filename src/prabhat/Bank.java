//Assignment 2.2
//Program: Create a class called bank having debit,credit and print the balance nitial balance should be 1000. 
//Perform debit & credit activities multiple time and print balance after all activities.

package prabhat;
class Bank{

	int balance = 1000;
	
	void debitAmt(int amt)
	{
	balance = balance - amt;
	} 

	void creditAmt(int amt)
	{
	balance = balance+ amt;
	}

	void printBalance()
	{
		System.out.println("Account Balance is "+balance);
	}
	
	//Main method
	public static void main(String [] arg)
	{
		Bank bank =new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(1000);
		bank.debitAmt(300);
		bank.creditAmt(4000);
		bank.printBalance();
	}
}