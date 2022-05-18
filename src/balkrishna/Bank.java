// Assignment no-02
// Create a class bank having debit, credit, and print balance using parameter methods 
package balkrishna;
class bank {
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
	   bank bank=new bank();
	   bank.debitAmount(500);
	   bank.creditAmount(5100);
	   bank.printBalance();
	   bank.debitAmount(1000);
	   bank.debitAmount(3000);
	   bank.printBalance();
 }
		
}