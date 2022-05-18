package keshav;

class BankExample{
	
	int balance = 1000;
	
	void debitAmt(int amt){
		if(amt <= balance){
			balance = balance - amt;
		}else{
			System.out.println("Insufficient balance");
		}
	}
	
	void printBalance(){
		System.out.println("Current balance is " + balance);
	}
	
	public static void main(String[] args){
		BankExample bankExample = new BankExample();
		bankExample.debitAmt(200);
		bankExample.printBalance(); //800
		bankExample.debitAmt(800);
		bankExample.printBalance(); //0
		bankExample.debitAmt(100);
		
	}
}