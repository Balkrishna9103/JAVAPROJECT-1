package jalpa ;

class Bank{
	int balance = 1000;

	void debitAmt (int amt){
		balance = balance - amt ;
		System.out.println("After Debited Rs " + amt + " Balance Is "+ balance);
	}

	void creditAmt (int amt){
		 balance = balance + amt ;
		System.out.println("After Credited Rs " + amt + " Balance Is "+ balance);
	}

	void printBalance(){
		System.out.println("Total Balance Of Account Is Rsn  " + balance);
	}
	public static void main (String [] args){
		Bank bank = new Bank () ;
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(1000);
		bank.debitAmt(300);
		bank.creditAmt(4000);
		bank.printBalance();
	}
}

	

	
		
