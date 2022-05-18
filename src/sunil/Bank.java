package sunil;

class Bank{	
	int balance = 2000;
	
	void creditAmount(int amount){
			balance = balance + amount ;
	}
	void debitAmount(int amount){
			balance = balance - amount ;
	}
	void printBalance(){
		System.out.println("Your Available Balance Is="+ balance);
	}
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.creditAmount(5000);
		bank.creditAmount(3000);		
		bank.printBalance();
		bank.debitAmount(3200);
		bank.creditAmount(200);
		bank.printBalance();
	}
}











