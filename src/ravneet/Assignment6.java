package ravneet;

class Assignment6 {

	void sumHundred() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		int sum = 0;
		int num = 0;
		while (sum <= 100) {
			num++;
			sum = sum + num;
		}
		System.out.println("Minimum required numbers to generate Sum of 100 : " + num);
	}

	void divisibleBySeventeenOrThirteen(int startnum, int endnum, int count) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		int firstnums = 0;

		while (startnum <= endnum) {
			if (startnum % 17 == 0) {
				System.out.println(startnum + " is divisible by 17");
				firstnums++;
			} else if (startnum % 13 == 0) {
				System.out.println(startnum + " is divisible by 13");
				firstnums++;
			}
			startnum++;
			if (firstnums == count)
				break;
		}
	}

	void divisibleByFiveAndSeven(int startnum, int endnum, int count) {
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
		System.out.println("Numbers divisible by Five and Seven are : ");
		int firstnums = 0;
		int index = startnum;
		while (index <= endnum) {
			if (index % 5 == 0 && index % 7 == 0) {
				System.out.println(index);
				firstnums++;
			}
			index++;
			if (firstnums == count)
				break;

		}
		if (firstnums < count) {
			System.out.println("We couln't find 2 numbers within the range of" + startnum + " and " + endnum);
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");
	}

	public static void main(String args[]) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.sumHundred();
		assignment6.divisibleBySeventeenOrThirteen(5, 40, 3);
		assignment6.divisibleByFiveAndSeven(5, 100, 2);
	}
}