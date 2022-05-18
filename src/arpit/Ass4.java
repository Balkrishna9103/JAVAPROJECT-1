package arpit;

class Ass4 {
	public static void main(String[] args) {
		Ass4 ass = new Ass4();
		ass.div5(10, 30);
		ass.div53(5, 18);
		ass.sum(1, 5);
		ass.diff(3, 9);
	}

	void div5(int j, int k) {
		System.out.println("## divisible by 5");
		int i = 0;
		for (i = j; i <= k; i++) {
			if (i % 5 == 0) {
				System.out.println("yr ans is " + i);
			}
		}
	}

	void div53(int j, int k) {
		System.out.println("## divisible by 3 & 5");
		int i = 0;
		for (i = j; i <= k; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("the ans is " + i);
			}
		}
	}

	void sum(int j, int k) {
		System.out.println("## SUM");
		int sum = 0;
		int i = 0;

		for (i = j; i <= k; i++) {
			sum = sum + i;
		}
		System.out.println("your SUM is :- " + sum);
	}

	void diff(int a, int b) {
		System.out.println("## DIFFERENCE");
		int sum1 = 0;
		int sum2 = 0;
		int fans = 0;
		int i = 0;
		for (i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				sum1 = sum1 + i;
				System.out.println(i);
			} else {
				sum2 = sum2 + i;
			}

		}
		fans = (sum2 - sum1);
		System.out.println("final ans is :- " + fans);
	}
}
