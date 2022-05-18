package pragati;

public class PrimeNumber {
	int count=0;
	int sum=0;
	int avg=0;
	void isPrimeNumber(int num){
		boolean isprimeflag=true;
		for(int index=2; index<num; index++) {
			if(num%index==0) {
				isprimeflag=false;
				break;
			}
		}
		if(isprimeflag==true) {
			count++;
			sum=sum+num;
			avg=sum/count;
			System.out.println(num+" is prime number");
		}
		
	}
	void primeNumberRange(int startR, int endR) {
		count=0;
		sum=0;
		avg=0;
		for(int index=startR; index<=endR; index++) {
			isPrimeNumber(index);
		}
		System.out.println(startR+ "->" +endR+ "="+count);
		System.out.println("sum of prime numbers = "+sum);
		System.out.println("Avg of prime numbers = "+avg);
	}
	public static void main(String[]args) {
		PrimeNumber primeNumber =new PrimeNumber();
		primeNumber.isPrimeNumber(7);
		primeNumber.primeNumberRange(100,120);
		
	}

}
