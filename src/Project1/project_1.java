package Project1;

public class project1 {
	void add(int num1, int num2) {
		System.out.println("Addition is =" + (num1 + num2));
	}

	void sub(int num3, int num4) {
		System.out.println("Subtraction is =" + (num3 - num4));
	}

	void mult(int num5, int num6) {
		System.out.println("Multiplication is =" + (num5 * num6));
	}

	void Div(int num7, int num8) {
		System.out.println("Divion is =" + (num7 / num8));
	}

	public static void main(String[] args) {
		project1 calculator1 = new project1();
		calculator1.add(10, 10);
		calculator1.sub(10, 50);
		calculator1.mult(30, 5);
		calculator1.Div(100, 10);

	}

}
