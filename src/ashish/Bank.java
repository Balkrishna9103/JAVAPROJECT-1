package ashish;

class Bank{

	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt<=balance){
			balance = balance - amt;
		}
		else{
			System.out.println("Insuffecient balance");	
		}
	}
	
	void creditAmt(int amt){
		balance = balance + amt;		
	}
	
	void printBalance(){
		System.out.println("Available Balance is: " + balance);		
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt(100);		
		bank.creditAmt(500);		
		bank.creditAmt(1000);
		bank.debitAmt(300);
		bank.creditAmt(4000);		
		bank.printBalance();
	}

}
