package varsha;
class Bank1{

	int balance = 1000;
	
	void debitAmt(int amt){
		balance = balance - amt;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
	}
	
	void printBalance(){
		System.out.println("Current Account balance is: "+ balance);
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.debitAmt(200);
		bank1.creditAmt(500);
		bank1.creditAmt(1000);
		bank1.debitAmt(300);
		bank1.printBalance();
		bank1.creditAmt(500);
		bank1.printBalance();
	}
}