package arpit;

class Calculator {
	int a = 5;
	int b = 10;

	public static void main(String[] args) {
		System.out.println("No 1= 5 & No 2=10");
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();

	}

	void add() {
		int ans = a + b;
		System.out.println("addition is " + ans);
	}

	void sub() {
		int ans = a - b;
		System.out.println("subtraction is " + ans);
	}

	void mul() {
		int ans = a * b;
		System.out.println("multiplication is " + ans);
	}

	void div() {
		int ans = b / a;
		System.out.println("division is " + ans);
	}
}