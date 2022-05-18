package poojaK;
class Bank{
	int balance = 1000;
	
	void debitAmt(int arg){
		//int debitValue;
		balance = balance - arg;
		
		System.out.println("debitated amt"+ balance);
	}
	void creditAmt(int arg){
		//int creditValue;
		balance = balance + arg;
		System.out.println("creditated amt"+ balance);
	}
	void printBalance(){
		System.out.println("Available balance is"+ balance);
	}
	
	
	public static void main(String[] args){
		Bank bankBalance = new Bank();
		bankBalance.debitAmt(200);
		bankBalance.creditAmt(500);
		bankBalance.creditAmt(1000);
		bankBalance.debitAmt(300);
		bankBalance.printBalance();
		bankBalance.creditAmt(4000);
		bankBalance.printBalance();
	}
}