package shekhar;


class Bank{

	int balance=1000;
	
	void debitAmount(int amount){
		
		balance = balance - amount;
		System.out.println("Account balance after amount debited is : "+balance+"Rs.");
	}
	
	void creditAmount(int amount){
		
		balance = balance + amount;
		System.out.println("Account balance after amount credited is : "+balance+"Rs.");
	}
	
	void printBalance(){
		System.out.println("Account balance is : "+balance+"Rs.");
	
	}
	
	public static void main(String[] args){
		
		Bank bank = new Bank();
		bank.debitAmount(500);
		bank.creditAmount(600);
		bank.creditAmount(1000);
		bank.debitAmount(400);
		bank.creditAmount(300);
		bank.printBalance();	
		
	}

}