package tusharD;

public class Bank {


		int balance = 5000;
		
		void debitAmout(int amt){
			balance = balance - amt;
		}
		
		void creditAmount(int amt){
			balance = balance + amt;
		}
		
		void printBalance(){
			System.out.println("Current Account balance is: "+ balance);
		}
		
		public static void main(String[] args){
			Bank bank = new Bank();
			bank.debitAmout(100);
			bank.creditAmount(800);
			bank.printBalance();//5700
			bank.creditAmount(100);
			bank.debitAmout(900);
			bank.creditAmount(600);
			bank.printBalance();//5500
		}
	}