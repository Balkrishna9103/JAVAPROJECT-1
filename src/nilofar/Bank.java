package nilofar;

class Bank{

	int balance = 1000;
	
	void debitAmt(int amt){
		balance = balance - amt;
		System.out.println("Amount debited is: " + balance);
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		System.out.println("Amount credited is: "+ balance);
	}
	
	void printBalance(){
		System.out.println("Your avaialble balance is: " + balance);
	}
	
	public static void main (String[]args){
		Bank bank = new Bank();
		bank.debitAmt(500);
		bank.creditAmt(2000);
		bank.creditAmt(500);
		bank.printBalance();
		bank.debitAmt(700);
		bank.debitAmt(200);
		bank.printBalance();
	}
}