package pratikK;
class Calculator1{
 void add(int a,int b){
      System.out.println("Addition of two numbers is " +(a+b));   
  
  }
  void sub(int a,int b){
      System.out.println("Subtraction of two numbers is " +(a-b));   
  
  }
  void multi(int a,int b){
      System.out.println("Multiplication of two numbers is " +(a*b));   
  
  }
  void div(int a,int b){
      System.out.println("Division of two numbers is " +(a/b));   
  
  }
  
  
 public static void main (String[] args){
 Calculator1 calculator1=new Calculator1();
 calculator1.add(20,10);
 calculator1.sub(20,10);
 calculator1.multi(20,10);
 calculator1.div(20,10);
 }


}