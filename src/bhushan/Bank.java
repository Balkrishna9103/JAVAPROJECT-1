package bhushan;

class Bank{
 int balance=1000;
	void credit(int n1){
		balance=balance+n1;
	}
	
	void debit(int n1){
		balance=balance-n1;
	}
	void Display(){
		System.out.println("Available Balance IS " +balance);
	}
		
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.credit(10);
		bank.credit(10);
		bank.debit(100);
		bank.debit(12);
		bank.Display();
		
	}
}