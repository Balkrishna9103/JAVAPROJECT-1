package minalS;

/*Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
*/

public class PrimeNumber {
	int count = 0;
	int sum = 0;

	void isPrime(int num) {
		boolean isPrimeNumberFlag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrimeNumberFlag = false;
				break;
			}
		}
		
		if (isPrimeNumberFlag == true) {
			System.out.println(num + " is prime number ");
			sum = sum + num;
			count++;
		}

	}

	void printPrimeNumberBetweenRange(int startR, int endR) {
		count = 0;
		sum=0;
		for (int index = startR; index <= endR; index++) {
			isPrime(index);
		}
		System.out.println("Total prime number between " + startR + " to " + endR + " is  : " + count);
		System.out.println("-----------------------------------------------------");
		System.out.println("Sum of total prime numbers between " + startR + " to " + endR + " is : " + sum);
		System.out.println("-----------------------------------------------------");
		int avg = sum / count;
		System.out.println("Average of total prime numbers between " + startR + " to " + endR + " is : " + avg);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(17);
		System.out.println("-----------------------------------------------------");
		primeNumber.printPrimeNumberBetweenRange(100,120);
	}
}
