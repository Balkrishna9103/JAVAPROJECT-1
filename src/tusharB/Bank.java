package tusharB;
class Bank{
	int balance=1000;
	void debitAmt(int amt){
		balance=balance-amt;
	}
	void creditAmt(int amt){
		balance=balance+amt;
	}
	void printBalance(){
		System.out.println(balance);
	}
	public static void main(String[] args){
		Bank bk =new Bank();
		bk.debitAmt(200);
		bk.creditAmt(500);
		bk.printBalance();
		bk.creditAmt(1000);
		bk.debitAmt(300);
		bk.printBalance();
		bk.creditAmt(4000);
		bk.printBalance();
	}
}