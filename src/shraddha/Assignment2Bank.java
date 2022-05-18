package shraddha;

class Assignment2Bank 
{	
	int balance = 1000;
	void debitAmt(int amt)
	{
		balance = balance - amt;
		System.out.println("Amount debited is " +balance);
	}
	void creditAmt(int amt)
	{
		balance = balance + amt;
		System.out.println("Amount credit is " +balance);
	}
	void printBalance()
	{
		System.out.println("Available balnce is " +balance);
	}
	public static void main(String[] args){
		Assignment2Bank bankbalance = new Assignment2Bank();
		bankbalance.debitAmt(200);
		bankbalance.creditAmt(500);
		bankbalance.creditAmt(1000);
		bankbalance.debitAmt(300);
		bankbalance.creditAmt(4000);
		bankbalance.printBalance();
	}
}