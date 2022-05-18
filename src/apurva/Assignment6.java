package apurva;

class Assignment6 {

	void displayResult(int startRange, int endRange) {
		int count = 0;
		while (startRange <= endRange) {

			if (startRange % 17 == 0) {
				System.out.println(startRange + " is divisible by 17");
				count++;
			} else if (startRange % 13 == 0) {
				System.out.println(startRange + "is divisible by 13");
				count++;
			}
			startRange++;
			if (count == 3)
				break;
		}
	}

	void processData(int startRange, int endRange) {
		int count = 0;
		while (startRange <= endRange) {

			if (startRange % 5 == 0 && startRange % 7 == 0) {
				System.out.println(startRange);
				count++;
			}
			startRange++;
			if (count == 3)
				break;
		}
	}

	void processResult() {
		int index = 1;
		int sum = 0;
		while (sum <= 100) {
			index++;
			sum = sum + index;
		}
		System.out.println("Minimum numbers whose sum is 100: " + index);
	}

	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.displayResult(5, 40);
		System.out.println("-------------------------");
		System.out.println("First two numbers divisible by 5 & 7 :");
		assignment6.processData(5, 100);
		System.out.println("-------------------------");
		assignment6.processResult();
	}
}