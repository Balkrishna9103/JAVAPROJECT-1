package apurva;

class Calculator1 {

	void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition of two numbers is " + sum);
	}

	void subtraction(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("Subtraction of two numbers is " + sub);
	}

	void multiplication(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("Multiplication of two numbers is " + mul);
	}

	void division(int num1, int num2) {
		int div = num1 / num2;
		System.out.println("Multiplication of two numbers is " + div);
	}

	public static void main(String[] args) {
		Calculator1 calculator1 = new Calculator1();
		calculator1.addition(10, 5);
		calculator1.subtraction(20, 10);
		calculator1.multiplication(14, 5);
		calculator1.division(12, 6);

	}

}