package deepshikhaInterviewQue;
/*
Create a class to satisfy below requirements. 
  a) Print Number is prime if Given number is prime. (parameterized method)
  b) Print all the prime numbers between range 100->120. (parameterized method)
     along with that Print total count of prime numbers between same range.
     along with that print sum of all prime numbers between same range
     along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
 */

public class Assignment9Prime {
	int count=0;
	int sum=0;
	int avg=0;
	void numberIsPrime(int num) {
		boolean isPrimeflag=true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				isPrimeflag=false;
				break;
			}
		}
		if(isPrimeflag==true) {
			System.out.println(num +" is prime number");
			count++;
			sum=sum+num;
			avg=sum/count;
		}
	}
	
	void primeNumberInRange(int startRange, int endRange) {
		
		for(int index=startRange;index<=endRange;index++) {
			numberIsPrime(index);
		}
		System.out.println("The total count of prime number between "+startRange+" to "+endRange+ " is "+count);
		System.out.println("sum of prime numbers from "+ startRange+" to "+endRange+" is "+sum);
		System.out.println("average value of prime numbers from "+startRange+" to "+endRange+" is "+ avg);
	}
public static void main(String[] args) {
	Assignment9Prime assignment9Prime=new Assignment9Prime();
	assignment9Prime.numberIsPrime(13);
	assignment9Prime.primeNumberInRange(50, 120);
}
}
