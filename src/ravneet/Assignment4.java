package ravneet;

class Assignment4 {

	void divisibleByFive(int startnum, int endnum) {

		int count = 0;

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");

		System.out.println("Numbers divisible by Five are : ");

		for (int num = startnum; num <= endnum; num++) {
			if (num % 5 == 0) {
				System.out.println(num);
				count = count + 1;
			}
		}

		System.out.println("Count of Numbers is : " + count);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");

	}

	void divisibleByFiveAndThree(int startnum, int endnum) {

		System.out.print("Numbers divisible by Five and Three are : ");

		for (int num = startnum; num <= endnum; num++) {
			if (num % 5 == 0 && num % 3 == 0) {
				System.out.println(num);
			}
		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
	}

	void sumOfNumbers(int startnum, int endnum) {

		System.out.print("Sum of Numbers Between " + startnum + " and " + endnum + " is : ");

		int sum = 0;

		for (int num = startnum; num <= endnum; num++) {
			sum = sum + num;
		}

		System.out.println(sum);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");

	}

	void differenceBetweenOddAndEven(int startnum, int endnum) {

		System.out.print("Difference between sum of odd Numbers and Even Numbers Between the Range of " + startnum
				+ " and " + endnum + " is : ");

		int diff = 0, evensum = 0, oddsum = 0;

		for (int num = startnum; num <= endnum; num++) {
			if (num % 2 == 0)
				evensum = evensum + num;
			else
				oddsum = oddsum + num;
		}
		diff = oddsum - evensum;
		System.out.println(diff);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");

	}

	public static void main(String args[]) {
		Assignment4 assignment4 = new Assignment4();
		assignment4.divisibleByFive(10, 30);
		assignment4.divisibleByFiveAndThree(5, 18);
		assignment4.sumOfNumbers(1, 5);
		assignment4.differenceBetweenOddAndEven(3, 9);
	}
}
