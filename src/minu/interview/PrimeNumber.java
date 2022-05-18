/*
 * Assignment - 9 :
Create a class to satisfy below requirements. 
	a) Print Number is prime if Given number is prime. (parameterized method)
	b) Print all the prime numbers between range 100->120. (parameterized method)
	along with that Print total count of prime numbers between same range.
	along with that print sum of all prime numbers between same range
	along with that print avg of prime numbers between same range.
 */

package minu.interview;

public class PrimeNumber {

	int count = 0;
	int sum = 0;

	void isPrimeNumber(int num) {
		boolean isPrimeFlag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrimeFlag = false;
				break;
			}
		}
		if (isPrimeFlag == true) {
			System.out.println(num + " is prime number");
			count++;
			sum = sum + num;
		}
	}

	void findPrimeNumber(int startR, int endR) {
		sum = 0;
		count = 0;
		System.out.println("Print all the prime numbers between " + startR + "-->" + endR);
		for (int index = startR; index <= endR; index++) {
			isPrimeNumber(index);
		}
		System.out.println(startR + "-->" + endR + " total prime number = " + count);
		System.out.println(startR + "-->" + endR + " sum of all prime number = " + sum);
		int average = sum / count;
		System.out.println(startR + "-->" + endR + " average of prime number = " + average);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(17);
		primeNumber.findPrimeNumber(100, 120);
	}
}
