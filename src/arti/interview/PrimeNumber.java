/* Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.
*/
package arti.interview;

public class PrimeNumber {

	boolean isPrimeFlag = true;
	int count = 0;
	int sum = 0;
	int average = 0;

	void isPrime(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrimeFlag = false;
				break;
			} else
				isPrimeFlag = true;
		}
		if (isPrimeFlag == true) {
			System.out.println(num + " is a Prime number");
			count++;
			sum = sum + num;
		} else
			System.out.println(num + " is not a Prime number");
	}

	void primeNumbersInRange(int startRange, int endRange) {
		count = 0;
		sum = 0;

		System.out.println("Prime numbers in the range " + startRange + "->" + endRange + " are : ");
		for (int num = startRange; num <= endRange; num++) {
			isPrime(num);
		}
		average = sum / count;
		System.out.println("Total No. of prime numbers in the given range " + startRange + "->" + endRange + " are : " + count);
		System.out.println("Sum of all prime numbers in the given range " + startRange + "->" + endRange + " is = " + sum);
		System.out.println("Average of all prime numbers in the given range " + startRange + "->" + endRange + " is = " + average);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(17);
		primeNumber.primeNumbersInRange(100, 120);
	}

}
