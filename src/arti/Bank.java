package arti;
class Bank{
		int balance=20000;
		
		void debitAmt(int amt)
		{
			balance = balance - amt;
		}
		
		void creditAmt(int amt)
		{
			balance = balance + amt;
		}
		void printData()
		{
			System.out.println("Account balance is " + balance);
		}
		
		public static void main(String[] args){
			
			Bank bank1=new Bank();
			
			bank1.debitAmt(1000);
			bank1.creditAmt(500);
			bank1.creditAmt(1500);
			bank1.debitAmt(1000);
			bank1.printData();
			bank1.creditAmt(2000);
			bank1.debitAmt(3000);
			bank1.printData();
		}
}