package ashish;

class Assignment4{
	
	void divisibleByFive(int startIndex, int endIndex){
		
		System.out.println("Divisible by 5, numbers are: ");
		for(int num = startIndex; num<=endIndex; num++){
			if(num%5==0){				
				System.out.println(num);				
			}			
		}
		System.out.println("===============================");
	}
	
	void divisibleByFiveAndThree(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int num = startIndex; num<=endIndex; num++){
			if(num%5==0 && num%3==0){				
				System.out.println(num);				
			}			
		}	
		System.out.println("===============================");		
	}
	
	void sumOfNumbers(int startIndex, int endIndex){
		int sum = 0;
		for(int num = startIndex; num<=endIndex; num++){
			sum = sum +	num;		
		}			
		System.out.println("sum is: " + sum);	
		System.out.println("===============================");		
	}
	
	void sumOfOddEvenNumbers(int startIndex, int endIndex){
		int sumOfEven = 0, sumOfOdd = 0, difference = 0;
		for(int num = startIndex; num<=endIndex; num++){
			if(num%2==0){
				sumOfEven = sumOfEven + num;
			}	
			else{
				sumOfOdd = sumOfOdd + num;
			}				
		}		
		System.out.println("Difference between sum of odd numbers and even numbers: "+ (sumOfOdd-sumOfEven));			
	}
	
	public static void main(String[] args){
	
		Assignment4 assignment4 = new Assignment4();
		assignment4.divisibleByFive(10, 30);		// 10,15,20,25,30
		assignment4.divisibleByFiveAndThree(5,18);	//	15
		assignment4.sumOfNumbers(1,5);				//  1+2+3+4+5 = 15
		assignment4.sumOfOddEvenNumbers(3,9);	    // (3+5+7+9)odd - (4+6+8)even = 6
		//assignment4.sumOfOddEvenNumbers(1,10);		//( (1+3+5+7+9)odd -2+4+6+8+10)even  = -5
	}
}