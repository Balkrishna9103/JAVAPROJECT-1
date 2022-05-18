/*  Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)  */

package amruta.Assignment_09;

class FindPrimeNum {
	int count = 0;
	int sum = 0;
	int average = 0;

	void isPrimeNumber(int num) {
		// boolean flag = true;
		int index = 2;
		for (; index < num; index++) { 
			if (num % index == 0) {
				// flag = false;
				break;
			}
		}

		if (index == num) {
			System.out.println("\n" + num + " is Prime Number.");
			count++;
			sum = sum + num;
			average = sum / count;
		}
	}

	void takeRangeToFindPrimeNum(int startNum, int endNum) {
		count = 0;
		sum = 0;
		average = 0;

		for (int index = startNum; index <= endNum; index++) {
			isPrimeNumber(index);
		}
		System.out.println("\nCount of Prime Numbers between 100 to 120 Range : " + count);
		System.out.println("\nSum of Prime Numbers between 100 to 120 Range : " + sum);
		System.out.println("\nAverage of Prime Numbers between 100 to 120 Range : " + average);
	}

	public static void main(String[] args) {

		FindPrimeNum findprimenumber = new FindPrimeNum();
		findprimenumber.isPrimeNumber(17);
		System.out.println("\n-------------------------------------------------------");
		findprimenumber.takeRangeToFindPrimeNum(100, 120);
	}
}
