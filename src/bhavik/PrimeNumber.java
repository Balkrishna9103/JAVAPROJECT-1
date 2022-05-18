package bhavik;

public class PrimeNumber {
	
	int count=0;
	int sum = 0;
	
	void isPrimeNumber(int num) {
		boolean isPrimeflag = true;
		for (int index=2; index<num; index++) {
			if (num%index == 0)	{
				isPrimeflag = false;
				break;
			}
		}
		if (isPrimeflag == true) {
			System.out.println(num + " is a prime number.");
			count++;
			sum = sum + num;
		}
	}
	
	void primeNumbersBetweenRange(int startR, int endR) {
		count = 0;
		sum = 0;
		for (int index=startR; index <= endR; index++) {
			isPrimeNumber(index);
		}
		System.out.println("Total prime numbers between "+ startR + " and "+ endR+ " are " +count);
		System.out.println("Sum of all prime numbers between "+ startR +" and "+ endR + " is "+ sum);
		double avg = sum/ count;
		System.out.println("Average of all prime numbers between "+ startR + " and "+ endR + " is " + avg);
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(61);
		primeNumber.primeNumbersBetweenRange(5,50);
	}
}