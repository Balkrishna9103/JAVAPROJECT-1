package dipali;
class Bank{
int balance=500;

void creditamt(int amt)
{
balance=balance+amt;
}
void debitamt(int amt)
{
balance=balance-amt;
}
void displayamt()
{
System.out.println("Current Balance is "+ balance);
}
public static void main(String[] args)
{
Bank bb=new Bank();
bb.creditamt(1000);
bb.debitamt(500);
bb.displayamt();
bb.debitamt(155);
bb.displayamt();
bb.creditamt(80);
bb.displayamt();
}
}