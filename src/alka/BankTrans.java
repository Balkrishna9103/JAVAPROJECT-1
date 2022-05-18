package alka;
class BankTrans 
{
	int balance=1000;

     void debitAmt(int amt)	
	 {
		balance=balance-amt;   
	 }
	 
	 void creditAmt(int amt)	
	 {
		balance=balance+amt;   
	 }
	 
	  void printAmt()	
	 {
		System.out.println("Final amount is " +balance) ; 
	 }
	 public static void main(String[] args)
	 {
		 BankTrans banktrans =new BankTrans();
		 banktrans.debitAmt(500);
		 banktrans.creditAmt(200);
		 banktrans.creditAmt(200);
		  banktrans.debitAmt(500);
		 banktrans.printAmt();
		 
	 }
	
} 