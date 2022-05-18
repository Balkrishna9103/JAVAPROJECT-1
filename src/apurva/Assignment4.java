package apurva;

class Assignment4 {

	void displayResult(int startRange, int endRange) {
		if (startRange > endRange)
			System.out.println("Invalid Entry");
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0)
				System.out.println("  " + index);
		}
	}

	void displayResultforTwoNumbers(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println("  " + index);
		}
	}

	void displaySum(int startRange, int endRange) {
		int sum = 0;
		for (int index = startRange; index <= endRange; index++)
			sum = sum + index;
		System.out.println("  " + sum);
	}

	void displayDifference(int startRange, int endRange) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = startRange; index <= endRange; index++)
			if (index % 2 == 0)
				evenSum = evenSum + index;
			else if (index % 2 != 0)
				oddSum = oddSum + index;
		System.out.println("Difference of even and odd even numbers is - " + (oddSum - evenSum));
	}

	public static void main(String[] args) {
		Assignment4 assignment4 = new Assignment4();
		System.out.println("The numbers divisible by 5 are: ");
		assignment4.displayResult(10, 30);
		System.out.println("The numbers divisible by 5 and 3 are: ");
		assignment4.displayResultforTwoNumbers(5, 18);
		System.out.println("Sum of all numbers in user defined range is: ");
		assignment4.displaySum(1, 5);
		assignment4.displayDifference(3, 9);
	}

}