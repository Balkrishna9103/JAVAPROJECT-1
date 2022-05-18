package arpit;

class Test1 {
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.div(1, 100);
	}

	void div(int a, int b) {
		int i = 0;
		for (i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " is divisible by 3 & 5");
			} else if (i % 3 == 0) {
				System.out.println(i + " is diviible by 3");
			} else if (i % 5 == 0) {
				System.out.println(i + " is divisible by 5");
			}
		}
	}

}