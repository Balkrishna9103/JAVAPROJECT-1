class Calculator1 {
      void add(int num1 ,int num2){
	       System.out.println("Sum is " + (num1 + num2));
	  }
	  void subtract(int num1 ,int num2) {
	       System.out.println("Subtraction is " + (num1 - num2));
	  }
	  void multiply(int num1 , int num2) {
	       System.out.println("Multiplication is " + (num1 * num2));
	  }
	  void division(int num1 , int num2) {
	       System.out.println("Division is " + (num1 / num2));
	  }
	  public static void main(String[] args) {
	         Calculator1 calculator1 = new Calculator1();
			 calculator1.add(30,3);
			 calculator1.subtract(20,5);
			 calculator1.multiply(4,5);
			 calculator1.division(25,5);
	  }
}
	  
		   
	  
	  