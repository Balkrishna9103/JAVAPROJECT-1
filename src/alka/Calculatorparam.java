package alka;
class Calculatorparam
{
   void add(int n1, int n2)
   {
     System.out.println("Sum is " +(n1 + n2 ));
   }
    void sub(int n1, int n2)
   {
     System.out.println("Subtraction  is  " +(n1 - n2 ));
   }
    void mul(int n1, int n2)
   {
     System.out.println("multiplication  is " +(n1 * n2 ));
   }
    void Div(int n1, int n2)
   {
     System.out.println("Division is " +(n1/n2 ));
   }
   
   
   public static void main(String[] arg)
   {
     Calculatorparam  calculatorparam   =new Calculatorparam();
	 calculatorparam.add(10,20);
	 calculatorparam.sub(10,20);
	 calculatorparam.mul(10,20);
     calculatorparam.Div(50,20);
   }
   


}