package prasad;

class Bank{
	int balance = 1000;
	
	void debitAmount(int amount){
		//System.out.println(balance);
		balance =  balance - amount;
	}
	
	void creditAmount(int amount) {
		//System.out.println(balance);
		balance = balance + amount;
	}
	
	void printStatement(){
	System.out.println("Your ramaining account statement is " + balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		System.out.println("");
		bank.debitAmount(500);
		bank.creditAmount(700);
		bank.debitAmount(1000);
		bank.creditAmount(2000);
		bank.creditAmount(100);
		bank.printStatement();
	}	
}