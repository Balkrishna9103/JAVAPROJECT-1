package shruti;
class Calculator{
      int num1 = 10;
	  int num2 = 2;
      void addition() {
	        int result = num1 + num2 ;
		    System.out.println("Addition is " + result);
      }
	  void subtraction(){
	       int result = num1 - num2 ;
		   System.out.println("Subtraction is " + result);
	  }
	  void multiplication() {
	        int result = num1 * num2 ;
		    System.out.println("Multiplication is " + result);
	  }
	  void division() {
	        int result = num1 / num2 ;
		    System.out.println("Division is " + result);
	  }
	  public static void main(String[] args) {
          Calculator cal = new Calculator();
          cal.addition();
          cal.subtraction();
          cal.multiplication();
          cal.division();
	  }
}
        
		
      
  
       

        
 		
		   
		  

