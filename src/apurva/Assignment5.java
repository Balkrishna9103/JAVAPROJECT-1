package apurva;

class Assignment5 {

	void displayResult(int startRange, int endRange) {
		int count = 0;
		for (int index = startRange; index <= endRange; index++) {
			if (index % 7 == 0 || index % 13 == 0) {
				if (index % 7 == 0)
					System.out.println(index + " is divisible by 7");
				else
					System.out.println(index + " is divisible by 13");
				count++;
			}
			if (count == 5)
				break;
		}
	}

	void displayOddNumbers(int startRange, int endRange) {
		int count = 0;
		for (int index = endRange; index >= startRange; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
				count++;
			}
			if (count == 3)
				break;
		}
	}

	void displaySumofAllNumbers(int startRange, int endRange) {
		int sum = 0;
		for (int index = startRange; index <= endRange; index++)
			sum = sum + index;
		System.out.println("Sum of all numbers in user defined range: " + sum);
	}

	void displayCountofNumbers(int startRange, int endRange) {
		int count = 0;
		for (int index = startRange; index <= endRange; index++)
			if (index % 7 == 0 || index % 13 == 0)
				count++;
		System.out.println("Total user defined numbers divisible by  7 or 13 are: " + count);
	}

	public static void main(String[] args) {
		Assignment5 assignment5 = new Assignment5();
		assignment5.displayResult(5, 40);
		System.out.println("------------------------------");
		System.out.println("First three odd numbers in reverse order: ");
		assignment5.displayOddNumbers(10, 20);
		System.out.println("------------------------------");
		assignment5.displaySumofAllNumbers(1, 5);
		System.out.println("------------------------------");
		assignment5.displayCountofNumbers(5, 40);
	}
}