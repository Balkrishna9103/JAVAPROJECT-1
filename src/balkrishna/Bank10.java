package balkrishna;
// Assignment no-02
// Create a class bank having debit, credit, and print balance using parameter methods 
class bank10 {
	   int balance=5000;
    void debitAmount(int amt){
       balance=balance-amt;
   }
    void creditAmount(int amt){
	   balance=balance+amt;
   }
    void printBalance(){
	   System.out.println("Current Balance="+balance);
   }
    public static void main(String[] args){
	   bank10 bank10 = new bank10();
	   bank10.debitAmount(500);
	   bank10.creditAmount(5100);
	   bank10.printBalance();
	  
	}
		
}