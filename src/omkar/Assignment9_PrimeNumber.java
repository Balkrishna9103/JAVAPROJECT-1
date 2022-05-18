
/*Assignment - 9 : 21st April'2022

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)*/
package omkar;

public class Assignment9_PrimeNumber {
	int count;
	int sum;
	int avg;
	void isPrimeNumber(int num) {
		boolean isPrimeflag=true;
		for (int index=2; index<num;index++) {
			if(num%index==0) {
				isPrimeflag =false;
				break;	
			}
		}	
		if(isPrimeflag==true) {
			System.out.println(num+" is Prime Number");
			count++;
			sum=sum+num;
			avg=sum/count;
		}	
	}
	
	void findPrimeNumberInRange(int startR, int endR) {
		count=0;
		sum=0;
		for(int index=startR;index<=endR;index++) {
			isPrimeNumber(index);			
		}
		System.out.println("***************************************************");	
		System.out.println(startR+ " -> " + endR + " count is " +count);
		System.out.println("***************************************************");	
		System.out.println(startR+ " -> " + endR + " total sum of Prime Number is " +sum);
		System.out.println("***************************************************");
		System.out.println(startR+ " -> " + endR + " avg of prime numbers " +avg);
	}
	
	public static void main(String[] args) {
		Assignment9_PrimeNumber assignment9_PrimeNumber = new Assignment9_PrimeNumber();
		assignment9_PrimeNumber.isPrimeNumber(11);
		System.out.println("****************************************************");
		assignment9_PrimeNumber.findPrimeNumberInRange(100,120);

	}

}
