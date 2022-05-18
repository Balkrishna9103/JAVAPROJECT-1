/*
Create a class to satisfy below requirements. 
  a) Print Number is prime if Given number is prime. (parameterized method)
  b) Print all the prime numbers between range 100->120. (parameterized method)
     along with that Print total count of prime numbers between same range.
     along with that print sum of all prime numbers between same range
     along with that print avg of prime numbers between same range.
Note : Create methods to satisfy a) and b), call them from main method. (total 3 methods)
 */
package prasad;

public class Prime {
	int count=0;
	int sum=0;
	int average=0;
	
	void print(int num) {
		boolean isPrimeflag=true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				isPrimeflag=false;
				break;
			}
		}
		if(isPrimeflag==true) {
			System.out.println(num +" is a prime number");
			count++;
			sum=sum+num;
			average=sum/count;
		}
	}

	void display(int startRange, int endRange) {

		for(int index=startRange;index<=endRange;index++) {
			print(index);
		}
		System.out.println("");
		System.out.println("The total count of prime number between "+startRange+" to "+endRange+ " is : "+count);
		System.out.println("");
		System.out.println("sum of prime numbers from "+ startRange+" to "+endRange+" is : "+sum);
		System.out.println("");
		System.out.println("average value of prime numbers from "+startRange+" to "+endRange+" is : "+ average);
	}

	public static void main(String[] args) {
		Prime Prime=new Prime();
		Prime.print(13);
		System.out.println("");
		System.out.println("The list of Prime Numbers from the given range are: ");
		Prime.display(100, 120);
	}
}


