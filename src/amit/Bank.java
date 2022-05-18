package amit;

class Bank{
	
	int balance = 1000;
	
	void debitamt(int amt){
		balance = balance - amt;
		//System.out.println("balance amount is" + balance);
	}
		
	void creditamt(int amt){
		balance = balance + amt;
		//System.out.println("balance amount is" + balance);
	}
	void printbalance(){
		System.out.println("Balance amount is" + balance);
	}
	
	public static void main (String[] args){
		Bank bank = new Bank();
		bank.debitamt(500);
		bank.creditamt(800);
		bank.creditamt(700);
		bank.debitamt(1000);
		bank.creditamt(1200);
		bank.printbalance();
	}
		
}