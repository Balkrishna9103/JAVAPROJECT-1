package tusharB;

class Assignment5{
	
	void divisible(int startRange, int endRange){
		int count=0;
		for(int index=startRange; index<=endRange; index++){
			if(index%7==0 ||index%13==0){
			if(index%7==0){
				System.out.println(index+ " is divisible by 7");
			}else if(index%13==0){
				System.out.println(index+ " is divisible by 13");
			}
			count++;
			}
			if(count==5)
			break;
		
		}
		System.out.println("");
	}
	void oddReverse(int startRange, int endRange){
		int count=0;
		System.out.println("Reverse range is ");
		for(int index=endRange; index>=startRange; index--)
		{
			if (index % 2 !=0){
			
			System.out.println(index);
			count++;
		}
		if (count == 3)
			break;
		}
	
	}
	void sumOfNumber(int startRange, int endRange){
		int sum=0;
		System.out.println(" ");
		for(int index=startRange; index<=endRange; index++)
			sum = sum + index;
			System.out.println("Sum is " +sum);
	}
	
	void countNumbers(int startRange, int endRange){
		int count=0;
		System.out.println(" ");
		for(int index=startRange; index<=endRange; index++){
			if(index % 7 == 0 || index % 13 == 0)
			count++;
		}
		System.out.println("Divisible by 7 or 13 count is  " +count);
	}
	
	public static void main(String[] args){
		Assignment5 assignment = new Assignment5();
		assignment.divisible(5,40);
		assignment.oddReverse(10,20);
		assignment.sumOfNumber(1,5);
		assignment.countNumbers(5,40);
	}
}

