package ravneet;

class Assignment5 {

	void divisibleBySevenOrThirteen(int startnum, int endnum, int count) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		int firstnumbers = 0;
		for (int num = startnum; num <= endnum; num++) {
			if (num % 7 == 0 || num % 13 == 0) {
				if (num % 7 == 0) {
					System.out.println(num + " is divisible by 7");
				} else
					System.out.println(num + " is divisible by 13");
				firstnumbers++;
			}
			if (firstnumbers == count)
				break;
		}
	}

	void threeOddnumbers(int startnum, int endnum, int count) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		System.out.println("First 3 odd numbers in reverse order are ");
		int firstnumbers = 0;
		for (int num = endnum; num >= startnum; num--) {
			if (num % 2 != 0) {
				System.out.println(num);
				firstnumbers++;
			}
			if (firstnumbers == count)
				break;
		}
	}

	void sumofNumbers(int startnum, int endnum) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		int sum = 0;
		for (int num = startnum; num <= endnum; num++)
			sum = sum + num;
		System.out.println("Sum of numbers between the range of " + startnum + " and " + endnum + " : " + sum);
	}

	void countNumbers(int startnum, int endnum) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		int count = 0;
		for (int num = startnum; num <= endnum; num++) {
			if (num % 7 == 0 || num % 13 == 0)
				count++;
		}
		System.out.println("Divisible by 7 or 13, Count is " + count);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
	}

	public static void main(String args[]) {
		Assignment5 assignment5 = new Assignment5();
		assignment5.divisibleBySevenOrThirteen(5, 40, 5);
		assignment5.threeOddnumbers(10, 20, 3);
		assignment5.sumofNumbers(1, 5);
		assignment5.countNumbers(5, 40);
	}
}