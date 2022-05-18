package arpit;

class Ass6 {

	public static void main(String[] args) {
		Ass6 ass = new Ass6();
		ass.minNum();
		ass.div1317(5, 100);
		ass.twoNum(5, 100);
	}

	void minNum() {
		int i = 1;
		int sum = 0;
		int count = 0;
		while (sum <= 100) {
			sum = sum + i;
			i++;
			count++;
		}
		System.out.println("Req. numbers :-" + count);
	}

	void div1317(int start, int end) {
		int count = 0;
		while (start <= end) {
			if (start % 13 == 0) {
				System.out.println(start + "the number is divisibe by 13.");
				count++;
			} else if (start % 17 == 0) {
				System.out.println(start + "the number is divisible by 17.");
				count++;
			}
			start++;
			if (count == 3) {
				break;
			}
		}
	}

	void twoNum(int start, int end) {
		int count = 0;
		while (start <= end) {
			if (start % 5 == 0 && start % 7 == 0) {
				System.out.println(start + " the number is divisible");
				count++;
			}
			start++;
			if (count == 2) {
				break;
			}
		}
	}
}
