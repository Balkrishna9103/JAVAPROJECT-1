package dnyaneshari;

class BankBalance{
       int balance=1333;
	   
	   void creditamt(int amt){
	    
		  balance=balance+amt;
	   
	   }
	   
	   void debitamt(int amt){
	   
	      balance=balance-amt;
	   
	   }
	   
	   void displayamt(){
	   
	       System.out.println("balance amount is "+ balance);
	   
	   }

         public static void main(String[] args){
		 
		       BankBalance bankbalance=new BankBalance();
		       bankbalance.creditamt(1400);
		       bankbalance.creditamt(240);
		       bankbalance.debitamt(2500);
		       bankbalance.creditamt(700);
		       bankbalance.displayamt();
		       bankbalance.debitamt(300);
		       bankbalance.displayamt();
		 
		 
		 }



}