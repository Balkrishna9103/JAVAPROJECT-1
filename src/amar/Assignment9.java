package amar;

public class Assignment9 {
	
	int count= 0;
	int sum= 0;
	int average =0;
	
	
	void isPrimeNumber(int num) {
		boolean isPrimeFlag= true;
		
		for (int index=2; index<num; index++){
			if(num%index==0) {
				isPrimeFlag= false;				
				break;
			}
		}
		
		if(isPrimeFlag== true) { 
			count++;
			sum= sum + num;
			average=sum/count;
			System.out.println(num+" is a prime number");
		}
			
	}
	
	void findPrimeNumberInR(int startR, int endR) {
		count= 0;
		sum= 0;
		average= 0;
		
		for(int index=startR; index<endR; index++) 
			isPrimeNumber(index);
		
		System.out.println("                                    ");
		System.out.println("Total number of prime no. from "+startR+" to "+endR+" = "+count);
		System.out.println("                                    ");
		System.out.println("Sum of prime numbers are "+sum);
		System.out.println("                                    ");
		System.out.println("Average of prime numbers are "+average);
			
	}		
	
	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.isPrimeNumber(19);
		System.out.println("                                     ");
		System.out.println("                                      ");
		assignment9.findPrimeNumberInR(100, 120);
		
		
	}

}
