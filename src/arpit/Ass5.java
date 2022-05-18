package arpit;

class Ass5 {
	
	public static void main(String[] args) {
		Ass5 ass = new Ass5();
		ass.div713(5, 40);
		ass.threeOdd(10, 20);
		ass.sum(1, 5);
		ass.divcnt(5, 40);
	}

	void div713(int a, int b) {
		
		int i = 0;
		int count = 0;
		for (i = a; i <= b; i++) {
			if (i % 7 == 0 || i % 13 == 0) {
				if (i % 7 == 0) {
					System.out.println(i + " is divisible by 7");
				} else {
					System.out.println(i + " is divisible by 13");

				}
				count++;

			}
			if (count == 5)
				break;

		}
	}

	void threeOdd(int a, int b) {
		int count = 0;
		int i;
		for (i = b; i >= a; i--) {
			if (i % 2 != 0) {
				System.out.println(i + "is odd number");
				count++;
			}
			if (count == 3)
				break;

		}

	}

	void sum(int a, int b) {
		int i;
		int sum = 0;
		for (i = a; i <= b; i++) {
			sum = sum + i;

		}
		System.out.println("Sum is :- " + sum);
	}

	void divcnt(int a, int b) {

		int i = 0;
		int count = 0;
		for (i = a; i <= b; i++) {
			if (i % 7 == 0 || i % 13 == 0) {
				if (i % 7 == 0) {
					count++;
				} else {
					count++;

				}

			}

		}
		System.out.println("Divisible by 7 or 13 :- " + count);
	}
}
