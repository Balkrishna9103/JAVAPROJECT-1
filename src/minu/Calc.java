package minu;

class RangeArithmetic{
	
	void divBy5(int startRange, int endRange)
	{
		for(int num = startRange; num<=endRange;num++){
			
			if(num%5 == 0)
				System.out.println(num + " is divisible by 5");
		}
	}
	
	void divBy5And3(int startRange, int endRange) {
		for(int num = startRange; num<=endRange; num++){
			
			if(num%5 == 0 && num%3 == 0)
				System.out.println(num + " is divisible by 5 and 3");
		}
	}
	
	void sumOfNum(int startRange, int endRange){
			int sum = 0;
		for(int num = startRange; num<=endRange;num++){
			sum = sum + num;
		}
		System.out.println("Total sum of number is: " + sum);
	}
	
	void diffOfOddEven(int startRange, int endRange){
		int evenNum=0;
		int oddNum=0;
		for(int num = startRange;num<=endRange;num++){
			if(num%2==0){
				evenNum = evenNum+num;
			} else
				oddNum= oddNum+num;
		}
		int difference= oddNum - evenNum;
		System.out.println("Difference between sum of odd and even numbers are: " + difference);
	}
	public static void main(String[] args)
	{
		RangeArithmetic rangeArithmetic = new RangeArithmetic();
		rangeArithmetic.divBy5(10,30);
		rangeArithmetic.divBy5And3(5,18);
		rangeArithmetic.sumOfNum(1,5);
		rangeArithmetic.diffOfOddEven(3,9);
	}
}