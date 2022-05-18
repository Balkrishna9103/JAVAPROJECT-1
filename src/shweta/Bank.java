package shweta;
class Bank{
   int balance=1000;

   void debit(int num1){
      balance = balance-num1;
   }

   void credit(int num1){
      balance=900;
      balance =balance+num1;//1100//
   }

   void display(){
      System.out.println("Total Available Balance is "+balance);
   }


   public static void main(String[] args){
       Bank bank= new Bank();
       bank.debit(100);
       bank.display();
       bank.credit(200);
       bank.display();
       bank.debit(500);
       bank.display();
       bank.debit(300);
       bank.display();
       bank.credit(500);
       bank.display();

    }
}