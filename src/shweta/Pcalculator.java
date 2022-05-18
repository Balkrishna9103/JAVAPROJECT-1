package shweta;

class Pcalculator{
   
   void Addition(int num1,int num2){
       System.out.println("Addition of two numbers is = "+ (num1 + num2));
   }
   
   void Subtraction(int num1,int num2){
       System.out.println("Subtraction of two numbers is = "+ (num1 - num2));
   }
   
   void Multiplication(int num1,int num2){
       System.out.println("Multiplication of two numbers is = "+ (num1 * num2));
   }
   void Division(int num1,int num2){
       System.out.println("Division of two numbers is = "+ (num1 / num2));
   }
   public static void main (String[] args){
       Pcalculator pcalculator = new Pcalculator();
	   
	   pcalculator.Addition(30,40);
	   pcalculator.Subtraction(20,10);
	   pcalculator.Multiplication(40,50);
	   pcalculator.Division(10,5);
   }
}