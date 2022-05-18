package pramod;
class Bank{
	int balance = 1000;
	
	void credit(int amt){
		balance = balance + amt;
	}
	
	void debit(int amt){
		if(balance>=amt)
		balance = balance - amt;
		else
			System.out.println("Insufficient Balance. Please withdraw amount less than " + balance);
		
			
	}
	
	void intrest(){
		balance = balance + ((balance / 100)*5); // 5% intrest
	}
	
	void printBalance(){
		System.out.println("Balance in your account is " + balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debit(200);
		bank.debit(300);
		bank.credit(400);
		bank.printBalance();
		bank.debit(100);
		bank.credit(500);
		bank.printBalance();
		bank.intrest();
		System.out.println("Intrest added");
		bank.printBalance();
	}
}