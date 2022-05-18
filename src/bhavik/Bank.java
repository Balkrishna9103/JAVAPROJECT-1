package bhavik;

class Bank{
	
	int balance = 1000;

	void debitAmt(int amt){
		balance = balance - amt;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
	}
	
	void printBalance(){
		System.out.println("Current account balance is " + balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.debitAmt(100);
		bank.creditAmt(500);
		bank.debitAmt(300);
		bank.creditAmt(700);
		bank.printBalance();
	}
}