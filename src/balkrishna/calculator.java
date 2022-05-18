package balkrishna;
class calculator
{
     int num1 = 20;
     int num2 = 10;
  void add()
     {
     int sum=num1+num2;
     System.out.println("Addition is ="+ sum);
	 }
  void sub()
     {
     int sum=num1-num2;
     System.out.println("Subtraction is ="+ sum);
	 }
  void mult()
     {
     int sum=num1*num2;
     System.out.println("Multiplication is ="+ sum);
	 }
 void Div()
     {
     int sum=num1/num2;
     System.out.println("Divion is ="+ sum);
	 }
	 public static void main (String[] args){
	  calculator cal = new calculator();
	   cal.add();
	   cal.sub();
	   cal.mult();
	   cal.Div();
	   }
}