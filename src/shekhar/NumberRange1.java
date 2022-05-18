package shekhar;

class NumberRange1{

	void divisibleBySevenAndThirteen(int startRange,int endRange){
		int count=0;
		for(int num=startRange;num<=endRange;num++){
			
			if(num%7==0||num%13==0){
				if(num%7==0)
					System.out.println("The Number divisible by 7 is:"+num);
				else
					System.out.println("The Number divisible by 13 is:"+num);
					count++;
				
			}
			if(count==5)
			break;
			
		}
	}
	
	void oddNumbersReverse(int startRange,int endRange){
		
		int count=0;
		for(int num=endRange;num>=startRange;num--){
			
			if(num%2!=0){
				
				System.out.println("Odd numbers in reverse order are:"+num);
				count++;
			
			}
			if(count==3)
				break;
		}
		
	}
	
	void sumOfAllNumbers(int startRange,int endRange){
		int sum=0;
		
		for(int num=startRange;num<=endRange;num++)
			sum = sum+num;
			System.out.println("Sum of numbers between 1 to 5 is:"+sum);
			System.out.println("*************************************************");		
	}
	
	void numbersDividedBySevenAndThirteen(int startRange,int endRange){
		int count=0;
		for(int num=startRange;num<=endRange;num++){
			
			if(num%7==0 || num%13==0)
			count++;	
		}
		System.out.println("Count of numbers divisible by 7 and 13 is:"+count);
	}
	
	public static void main(String[] args){
		
		NumberRange1 numberrange1 = new NumberRange1();
		numberrange1.divisibleBySevenAndThirteen(5,40);
		numberrange1.oddNumbersReverse(10,20);
		numberrange1.sumOfAllNumbers(1,5);
		numberrange1.numbersDividedBySevenAndThirteen(5,40);
	}
}