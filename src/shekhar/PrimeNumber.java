/*
Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
*/
package shekhar;

public class PrimeNumber {
	int count = 0;
	int sum = 0;
	int average;

	void isPrimeNumber(int num) {

		boolean isPrimeNumberflag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrimeNumberflag = false;
				break;
			}
		}
		if (isPrimeNumberflag == true) {
			System.out.println("prime numbers are : " + num);
			count++;
			sum = sum + num;
			average = sum / count;
		}
	}

	void primeNumberRange(int startRange, int endRange) {
		count = 0;
		sum = 0;
		for (int index = startRange; index <= endRange; index++) {
			isPrimeNumber(index);
		}
		System.out.println("Total prime numbers are : " + count);
		System.out.println("Sum of prime numbers is: " + sum);
		System.out.println("Average of prime number is: " + average);
	}

	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.isPrimeNumber(17);
		primenumber.isPrimeNumber(15);
		primenumber.primeNumberRange(100, 120);
	}

}
