package apurva;

class Calculator {

	int num1 = 10;
	int num2 = 2;

	void addition() {
		int sum = num1 + num2;
		System.out.println("Addition of two numbers is " + sum);
	}

	void subtraction() {
		int sub = num1 - num2;
		System.out.println("Subtraction of two numbers is " + sub);
	}

	void multiplication() {
		int mul = num1 * num2;
		System.out.println("Multiplication of two numbers is " + mul);
	}

	void division() {
		System.out.println("Sum is " + (num1 + num2));
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
	}
}
