/* Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)

*/

package tamanna;

public class A9PrimeNumber {

	int count = 0, primeSum = 0;

	void checkPrimeNumber(int num) {
		boolean isPrime = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is prime number.");
			count++;
			primeSum = primeSum + num;
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

	void checkPrimeNoRange(int startRange, int endRange) {
		count = 0;
		primeSum = 0;
		for (int index = startRange; index <= endRange; index++) {
			checkPrimeNumber(index);
		}
		System.out.println();
		System.out.println("Total prime numbers between " + startRange + " and " + endRange + " are: " + count);
		System.out.println("Sum of prime numbers between " + startRange + " and " + endRange + " is: " + primeSum);
		System.out.println("Avg of prime numbers between " + startRange + " and " + endRange + " is: " + (primeSum / count));
	}

	public static void main(String[] args) {
		A9PrimeNumber a9PrimeNumber = new A9PrimeNumber();
		a9PrimeNumber.checkPrimeNumber(7);
		a9PrimeNumber.checkPrimeNoRange(100, 120);
	}
}
