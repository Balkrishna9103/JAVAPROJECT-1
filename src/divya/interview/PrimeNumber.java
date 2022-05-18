/* Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
     a) Print Number is prime if Given number is prime. (parameterized method)
     b) Print all the prime numbers between range 100->120. (parameterized method)
        along with that Print total count of prime numbers between same range.
        along with that print sum of all prime numbers between same range
        along with that print avg of prime numbers between same range.
Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
 */

package divya.interview;

public class PrimeNumber {
	int count = 0;
	int sum = 0;
	int average = 0;
	

	void isPrimeNumber(int num) {
		boolean isPrimeFlag = true;
		for (int index = 2; index < num; index++) {
			
			if (num % index == 0) {
				isPrimeFlag = false;
				System.out.println(num + " is not a prime number");
				break;
			}
		}

		if (isPrimeFlag == true) {
			System.out.println(num + " is a prime number");
			count++;
			sum = sum + num;
			average = sum / count;

		}
	}

	void findPrimeNumberInRange(int startRange, int endRange) {
		count = 0;
		for (int index = startRange; index < endRange; index++) {
			isPrimeNumber(index);
		}
		System.out.println("Prime numbers between " + startRange + " and " + endRange + "=" + count);
		System.out.println("Sum of prime numbers in the range " + startRange + " and " + endRange + "=" + sum);
		System.out.println("Average of prime numbers in the range " + startRange + " and " + endRange + " is " + sum
				+ "/" + count + " = " + average);

	}

	public static void main(String[] args) {

		PrimeNumber primenumber = new PrimeNumber();
		primenumber.isPrimeNumber(13);
		primenumber.findPrimeNumberInRange(100, 120);
	}
}
