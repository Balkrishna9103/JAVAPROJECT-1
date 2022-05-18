package shweta;

class Calculator{

   int num1=30;
   int num2=40;
   
   
   void Addition(){
   int ans=num1+num2;
   System.out.println("Addition of "+num1 +" and "+num2 +" is "+ans);
   }
   
   void Subtraction(){
   int ans=num1-num2;
   System.out.println("Subtraction of "+num1 +" and "+num2 +" is "+ans);
   }
   
   void Multiplication(){
   int ans=num1*num2;
   System.out.println("Multiplication of "+num1 +" and "+num2 +" is "+ans);
   }
   
   void Division(){
   int ans=num1/num2;
   System.out.println("Division of "+num1 +" and "+num2 +" is "+ans);
   }
   
   public static void main(String[] args){
       Calculator calculator = new Calculator();
	   calculator.Addition();
	   calculator.Subtraction();
	   calculator.Multiplication();
	   calculator.Division();
   }
}