package apurva;
/*Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.*/

public class Assignment9_PrimeNumbers {

	int count;
	double sum = 0;
	double avg;

	void isPrimeNumber(int num) {
		boolean flag = false;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			count++;
			sum = sum + num;
			avg = sum / count;
			System.out.println(num + " - is a Prime Number");
		}
	}

	void verifyPrimeNumbersInGivenRange(int startRange, int endRange) {
		count = 0;
		sum = 0;
		avg = 0;
		for (int index = startRange; index < endRange; index++)
			isPrimeNumber(index);
		System.out.println("   ");
		System.out.println("Total count of Prime Numbers in range between 100 to 120: " + count);
		System.out.println("   ");
		System.out.println("Sum of prime numbers in range 100 to 120: " + sum);
		System.out.println("   ");
		System.out.println("Average of prime numbers in range 100 to 120: " + avg);
	}

	public static void main(String[] args) {
		Assignment9_PrimeNumbers assignment9_PrimeNumbers = new Assignment9_PrimeNumbers();
		assignment9_PrimeNumbers.isPrimeNumber(17);
		assignment9_PrimeNumbers.isPrimeNumber(18);
		System.out.println("                  ");
		System.out.println("Prime Numbers in Range between 100 to 120:");
		assignment9_PrimeNumbers.verifyPrimeNumbersInGivenRange(100, 120);
	}

}
