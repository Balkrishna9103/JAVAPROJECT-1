package divya;
class Balance{
	
	int balanceamount = 10000;
	
	void debitAmount(int amt){
		balanceamount = balanceamount - amt;
		
	}
	
	void creditAmount(int amt){
		
		balanceamount = balanceamount + amt;
	}
	
	void printBalance(){
		
		System.out.println(balanceamount);
		
	}
	
	public static void main(String[] args){
		
		Balance balance = new Balance();
		balance.debitAmount(200);
		balance.creditAmount(500);
		balance.creditAmount(1000);
		balance.debitAmount(300);
		balance.printBalance();
		balance.creditAmount(4000);
		balance.printBalance();
	}
	
}