package tamanna;

public class A2Bank {
	
	int balance=1000;
	
	void debit(int amount){
		balance=balance-amount;
		
	}
	
	void credit(int amount){
		balance=balance+amount;
	}
	
	void printBalance(){
		System.out.println("Balance is : "+ balance);
	}
	
	public static void main(String[] args){
		A2Bank a2Bank=new A2Bank();
		a2Bank.debit(200);
		a2Bank.credit(500);
		a2Bank.credit(1000);
		a2Bank.debit(300);
		a2Bank.credit(4000);
		a2Bank.printBalance();	
	}
}
