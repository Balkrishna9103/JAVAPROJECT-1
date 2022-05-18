package ravneet;

class Assignment1 {
	int num1 = 10;
	int num2 = 2;

	void add() {
		int ans = num1 + num2;
		System.out.println("Sum of number : " + ans);
	}

	void sub() {
		int ans = num1 - num2;
		System.out.println("Substraction of number : " + ans);
	}

	void mul() {
		int ans = num1 * num2;
		System.out.println("Multiplication of number : " + ans);
	}

	void div() {
		int ans = num1 / num2;
		System.out.println("Division of numbers : " + ans);
	}

	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.add();
		assignment1.sub();
		assignment1.mul();
		assignment1.div();
	}
}