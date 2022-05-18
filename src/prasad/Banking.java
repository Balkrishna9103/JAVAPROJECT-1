package prasad;

class Banking{
	int balance = 1000;
	
	void debitAmount(int amount){
		//System.out.println(balance);
		balance =  balance - amount;
	}
	
	void creditAmount(int amount) {
		//System.out.println(balance);
		balance = balance + amount;
	}
	
	void printStatement(){
	System.out.println("Your ramaining account statement is " + balance);
	}
	
	public static void main(String[] args){
		Banking banking = new Banking();
		System.out.println("");
		banking.debitAmount(500);
		banking.creditAmount(700);
		banking.debitAmount(1000);
		banking.creditAmount(2000);
		banking.creditAmount(100);
		banking.printStatement();
	}	
}