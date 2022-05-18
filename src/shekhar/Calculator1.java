package shekhar;

class Calculator1{

	void addition(int firstNumber,int secondNumber){
		
		System.out.println("Addition of two numbers is : "+(firstNumber + secondNumber));
	}
	
	void subtraction(int firstNumber,int secondNumber){
		System.out.println("Subtraction of two numbers is : "+(firstNumber - secondNumber));
	}
	
	void multiplication(int firstNumber,int secondNumber){
		System.out.println("Multiplication of two numbers is : "+(firstNumber * secondNumber));
		
	}
	
	void division(int firstNumber,int secondNumber){
		System.out.println("Division of two numbers is : "+(firstNumber / secondNumber));
		
	}

	public static void main(String[] args){	
		
		Calculator1 calculator1 = new Calculator1();
		
		calculator1.addition(10,10);
		calculator1.subtraction(16,12);
		calculator1.multiplication(5,6);
		calculator1.division(24,8);
		
	}




}