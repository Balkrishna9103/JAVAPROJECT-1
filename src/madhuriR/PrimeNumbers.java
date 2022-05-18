package madhuriR;

public class PrimeNumbers {
	int count;
	int sum;
	float avg;
	
	void isPrime(int num) {
		boolean isPrimeflag = true;
		for(int index =2;index<num;index++) {
			if(num%index==0) {
				isPrimeflag = false;
				System.out.println(num+" is not prime number");
				break;	
			}
		}
		if(isPrimeflag == true) {
			count++;
			sum = sum+num;
			avg = sum/count;
			System.out.println(num+" is prime number");
		}
		
	}
	void primeNumberRange(int sRange,int eRange) {
		count=0;
		sum = 0;
		avg = 0.0f;
		for(int index=sRange;index<=eRange;index++) {
			isPrime(index);
		}
		System.out.println("Total prime number between "+sRange +" and "+ eRange +" is "+count);
		System.out.println("Total sum of number between "+sRange +" and "+ eRange +" is "+sum);
		System.out.println("Total average of number between "+sRange +" and "+ eRange +" is "+avg);
		
	}
public static void main(String[] args) {
	PrimeNumbers primeNumbers = new PrimeNumbers();
	primeNumbers.isPrime(17);
	primeNumbers.primeNumberRange(100, 120);
}
}
