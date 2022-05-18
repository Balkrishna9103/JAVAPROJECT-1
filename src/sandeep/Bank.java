//Assignment: 2.2
package sandeep;

class Bank{
	int balance = 1000;
	
	void debitAmount(int amount){
		balance = balance - amount;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
	}
	
	void printBalance(){
		System.out.println("The available account balance is: " + balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmount(200);
		bank.creditAmount(500);
		bank.creditAmount(1000);
		bank.debitAmount(300);
		bank.creditAmount(4000);
		bank.printBalance();
	}
}