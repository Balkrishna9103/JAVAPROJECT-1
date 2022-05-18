package minu;

class BankBalance {
	
	int balance=1000;
	
	void debitAmount(int amount)
	{
		balance = balance - amount;
	}
	void creditAmount(int amount)
	{
		balance = balance + amount;
	}
	void printBalance()
	{
		System.out.println("Your current balance is " + balance);
	}
	
	public static void main(String[] args)
	{
		BankBalance bankBalance = new BankBalance();
		bankBalance.debitAmount(200);
		bankBalance.creditAmount(500);
		bankBalance.creditAmount(1000);
		bankBalance.debitAmount(300);
		bankBalance.creditAmount(4000);
		bankBalance.printBalance();
	}
}