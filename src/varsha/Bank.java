package varsha;
class Bank{

	int balance = 1000;
	
	void debitAmt(int amt){
		balance = balance - amt;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
	}
	
	void printBalance(){
		System.out.println("Current Account balance is: "+ balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(200);
		bank.creditAmt(500);
		bank.creditAmt(1000);
		bank.debitAmt(300);
		bank.printBalance();
		bank.creditAmt(500);
		bank.printBalance();
	}
}