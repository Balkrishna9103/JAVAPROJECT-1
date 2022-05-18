package prateekM;

class Bank{
	
	int balance = 1000;
	
	void debit(int x){
		balance = balance - x;
		System.out.println(balance+" got debited from your account");
	}
	
	void credit(int y){
		balance = balance + y;
		System.out.println(balance+ "  got credited in your account");
	}
	
	void printBalance(){
		System.out.println("Current Balance is "+balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debit(200);
		bank.printBalance();
		bank.credit(500);
		bank.printBalance();
		bank.credit(1000);
		bank.printBalance();
		bank.debit(300);
		bank.printBalance();
		bank.credit(4000);
		bank.printBalance();
	}
}