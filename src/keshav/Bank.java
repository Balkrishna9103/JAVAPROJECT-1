package keshav;

/*Program 2:
Create a class called Bank having debit, credit and print balance facility.
initial balance should be 1000. 
Perform debit & credit activities multiple time and print balance after all activities.*/

class Bank {

        int balance = 1000;

        void debitAmt (int debit) {
            balance = balance - debit;
        }

        void creditAmt (int credit) {
            balance = balance + credit;
        }

        void printBalance () {
        System.out.println ("Your bank balance is " + balance);
        }
        public static void main (String[] args){
            Bank bank = new Bank();
            bank.debitAmt(200);
            bank.creditAmt(500);
            bank.creditAmt(1000);
            bank.debitAmt(300);
            bank.creditAmt(4000);
            bank.printBalance();
        }
}


