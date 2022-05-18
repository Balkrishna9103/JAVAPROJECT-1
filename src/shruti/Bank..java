class Bank{
     int balance = 1000;
	  void debitAmt(int amt){
	       if(amt<= balance)
		      balance = balance - amt;
		   else
		       System.out.println("Insufficient amount");
	  }
	  void creditAmt(int amt){
	       balance = balance + amt;
	  }
	  void printBalance(){
	       System.out.println("Current balance is " + balance);
	  }
	  public static void main(String[] args){
	         Bank bank = new Bank();
			 bank.debitAmt(200);
		     bank. creditAmt(500);
             bank.creditAmt(1000);	        
		     bank. debitAmt(300);
		     bank. creditAmt(4000);
			 bank.printBalance();
	      	
	 }
}
	         
		   