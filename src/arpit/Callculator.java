package arpit;

class Callculator {
	public static void main(String[] args) {

		Callculator cal = new Callculator();
		cal.add(5, 10);
		cal.sub(10, 5);
		cal.mul(4, 5);
		cal.div(30, 5);

	}

	void add(int s1, int s2) {
		int ans = s1 + s2;
		System.out.println("The addition of " + s1 + "and " + s2 + "is " + ans);
	}

	void sub(int s1, int s2) {
		int ans = s1 - s2;
		System.out.println("The subraction of " + s1 + "and " + s2 + "is " + ans);
	}

	void mul(int s1, int s2) {
		int ans = s1 * s2;
		System.out.println("The multiplication of " + s1 + "and " + s2 + "is " + ans);
	}

	void div(int s1, int s2) {
		int ans = s1 / s2;
		System.out.println("The division of " + s1 + "and " + s2 + "is " + ans);
	}
}