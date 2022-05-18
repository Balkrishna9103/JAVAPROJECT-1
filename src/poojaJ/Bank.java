package poojaJ;

class Bank{
	int balance=10000;
	
	void creditAmount(int amt){
		balance=balance+amt;
		System.out.println ("Rs." +amt+ " credited to a/c");
	}
	
	void debitAmount(int amt){
		balance= balance-amt;
		System.out.println ("Rs." +amt+ " debited from a/c");
	}
	
	void displayBalance(){
		System.out.println("Available balance is " +balance);
	}
	
	public static void main(String[]args){
		Bank bank = new Bank();
		System.out.println("Available balance is " +bank.balance);
		System.out.println();
		bank.creditAmount(500);
		bank.displayBalance();
		bank.debitAmount(200);
		bank.debitAmount(500);
		bank.debitAmount(1000);
		bank.displayBalance();
		bank.creditAmount(3000);
		bank.displayBalance();
		
}

}