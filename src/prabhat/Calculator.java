//Assignemt 2.2:
//Program 1: Calculator with parameterized method
package prabhat;
class Calculator{

    void add(int num1, int num2){	
	System.out.println("Summation of "+ num1 + " and " +num2 + " is : "+ (num1+num2));
	}
	
	void sub(int num1, int num2){	
	System.out.println("Subtraction of "+ num1 + " and " +num2 + " is : "+ (num1-num2));
	}
	
    void div(int num1, int num2){	
	System.out.println("Division of "+ num1 + " and " +num2 + " is : "+ (num1/num2));
	}
	
	  void mul(int num1, int num2){	
	System.out.println("Multiplication of "+ num1 + " and " +num2 + " is : "+ (num1*num2));
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
	    calculator.add(100,150);
	    calculator.sub(200,50);
	    calculator.div(400,10);
	    calculator.mul(20,100);
	
}
}