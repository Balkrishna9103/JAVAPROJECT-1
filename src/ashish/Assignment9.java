/* Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
*/

package ashish;

public class Assignment9 {
	int count = 0;
	int sum = 0;
	int average = 0;

	public void isPrimeNumber(int number) {

		boolean isPrimeflag = true;

		for (int startIndex = 2; startIndex < number; startIndex++) {
			if (number % startIndex == 0) {
				isPrimeflag = false;
				break;
			}
		}

		if (isPrimeflag == true) {
			System.out.println(number + " is a prime number");
			count++;
			sum = sum + number;
			average = sum / count;
		}

	}

	public void isPrimeNumberInRange(int startRange, int endRange) {
		count = 0;
		sum = 0;
		System.out.println("Prime numbers between the range "+ startRange + " and " + endRange + " are :" );
		for (int index = startRange; index <= endRange; index++) {
			isPrimeNumber(index);
		}		
		System.out.println(" ");
		System.out.println("Total Count of Prime numbers between " + startRange + " and " + endRange + " = " + count);
		System.out.println("Sum of all Prime numbers between " + startRange + " and " + endRange + " = " + sum);
		System.out.println("Average of all Prime numbers between " + startRange + " and " + endRange + " = " + average);
	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.isPrimeNumber(11);
		System.out.println("------------------- ");
		assignment9.isPrimeNumberInRange(100, 120);
		
	}
}
