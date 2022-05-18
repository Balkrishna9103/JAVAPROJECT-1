package ravneet;

class Bank {

	int balance = 1000;

	void debitAmount(int amt) {
		balance = balance - amt;
	}

	void creditAmount(int amt) {
		balance = balance + amt;
	}

	void printBalance() {
		System.out.println("Your current balance amount is : " + balance);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.printBalance();
		bank.debitAmount(200);
		bank.creditAmount(500);
		bank.creditAmount(1000);
		bank.debitAmount(300);
		bank.printBalance();
		bank.creditAmount(4000);
		bank.printBalance();
	}
}