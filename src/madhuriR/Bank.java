package madhuriR;
//Create class having credit debit and print balance functionality

class Bank{
	int balance = 1000;
 
	void creditAmnt(int amt){
		balance = balance + amt; 
	}
	void debitAmnt(int amt){
		balance = balance - amt;
	}
	void printBalance(){
		System.out.println("Account balance is "+ balance);
	}
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmnt(200);
		bank.creditAmnt(500);
		bank.creditAmnt(300);
		bank.creditAmnt(100);
		bank.printBalance();
		bank.creditAmnt(4000);
		bank.printBalance();	
	}
}