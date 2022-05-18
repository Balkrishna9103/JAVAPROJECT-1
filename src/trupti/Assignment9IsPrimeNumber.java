/*Assignment - 9 : 21st April'2022
Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                      along with that Print total count of prime numbers between same range.
                      along with that print sum of all prime numbers between same range
                      along with that print avg of prime numbers between same range.

Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
*/
package trupti;

public class Assignment9IsPrimeNumber {
	
	int count=0;
	int sum=0;
	int avg=0;
	
	void isPrimeNumber(int num) {
		
		boolean flag=true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
			flag=false;
			break;
			}
		}
		   if(flag==true) {
			System.out.println(num+" is prime number");
			count++;
			sum=sum+num;
			avg=sum/count;
			}
	}
	
	void isPrimeNumberInRange(int startR, int endR) {
		System.out.println("Prime Numbers Between Range "+startR+" to "+endR+" is : ");
		sum=0;
		count=0;
		for(int index=startR;index<=endR;index++) {
			isPrimeNumber(index);
		}
		System.out.println("----------------------------------");
		System.out.println("Range "+startR+" to "+endR+"----> Count is : "+count);
		System.out.println("----------------------------------");
		System.out.println("Range "+startR+" to "+endR+"----> Sum is: "+sum);
		System.out.println("----------------------------------");
		System.out.println("Range "+startR+" to "+endR+"----> Average is: "+avg);
	}
	
	public static void main(String[] args) {
		Assignment9IsPrimeNumber assignment9IsPrimeNumber=new Assignment9IsPrimeNumber();
		assignment9IsPrimeNumber.isPrimeNumber(5);
		System.out.println("-------------------");
		assignment9IsPrimeNumber.isPrimeNumberInRange(100,120);
	}
}
