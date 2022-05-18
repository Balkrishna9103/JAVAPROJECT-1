package minalS;

//Assignment: 2
//Program: 2

class Bank{
	int balance=1000;
	
	void debit(int ammount){
		balance=balance-ammount;
	}
	
	void credit(int ammount){
		balance=balance+ammount;
	}
	
	void printBalance(){
		System.out.println("Available balance is : "+balance);
	}
	
	public static void main(String[] args){
		Bank bank=new Bank();
		
		bank.debit(320);
		bank.credit(500);
		bank.credit(1500);
		bank.printBalance();
		bank.debit(400);
		bank.printBalance();
	}
}