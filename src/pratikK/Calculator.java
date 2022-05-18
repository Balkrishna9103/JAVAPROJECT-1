package pratikK;
class Calculator{
  int num1=10;
  int num2=2;
 
  void add(){
   int ans = num1+num2;
   System.out.println("Sum is "+ans);
   }
  void sub(){
	  int ans2=num1-num2;
	  System.out.println("Answer is "+ans2);
	    } 
  void multi(){
	  int ans3=num1*num2;
	  System.out.println("Answer is "+ans3);
	    } 	
  void div(){
	  int ans4=num1/num2;
	  System.out.println("Answer is "+ans4);
	    } 
		
   public static void main(String[] args){
	   Calculator cal= new Calculator();
	   cal.add();
	   cal.sub();
	   cal.multi();
	   cal.div();	   
 }
}
