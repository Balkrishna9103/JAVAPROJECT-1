package arpit;

class Bank {
	int balance = 1000;

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.debit(500);
		bank.credit(200);
		bank.debit(100);
		bank.printBal();
	}

	void debit(int amt) {
		balance = balance - amt;
	}

	void credit(int amt) {
		balance = balance + amt;
	}

	void printBal() {

		System.out.println("Yr final balance is " + balance);
	}

}