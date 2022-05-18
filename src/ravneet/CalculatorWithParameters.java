package ravneet;

class CalculatorWithParameters {

	void addition(int num1, int num2) {
		System.out.println("Sum of two numbers is :" + (num1 + num2));
	}

	void substraction(int num1, int num2) {
		System.out.println("Substraction of two numbers is :" + (num1 - num2));
	}

	void multiplication(int num1, int num2) {
		System.out.println("Multiplication of two numbers is :" + (num1 * num2));
	}

	void division(int num1, int num2) {
		System.out.println("Division of two numbers is :" + (num1 / num2));
	}

	public static void main(String[] args) {
		CalculatorWithParameters calculatorwithparameters = new CalculatorWithParameters();
		calculatorwithparameters.addition(10, 20);
		calculatorwithparameters.substraction(40, 30);
		calculatorwithparameters.multiplication(50, 80);
		calculatorwithparameters.division(6, 3);
	}
}