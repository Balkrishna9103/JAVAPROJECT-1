package akshayM;

class Assignment4{
	void displayNumbers(int startRange, int endRange)
	{
		System.out.println("Divisible by 5, numbers are:");
		for(int index = startRange; index <=endRange; index++)
		{
			if(index%5==0)
			{
				System.out.println(index);
			}
		}
	}
	
	void displayNumbers2(int startRange, int endRange)
	{
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int index=startRange; index <= endRange; index++)
		{
			if(index%5==0 && index%3==0)
				System.out.println(index);
		}
	}
	
	void sumOfRange(int startRange, int endRange)
	{
		int sum = 0;
		for(int index = startRange; index<= endRange; index++)
			sum = sum + index;
		System.out.println("Sum of numbers in given range is: "+sum);
	}
	
	void differenceSumOfEvenOdd(int startRange, int endRange)
	{
		int evenSum = 0;
		int oddSum = 0;
		int difference = 0;
		for(int index = startRange; index <= endRange; index++)
		{
			if(index%2 ==0)
				evenSum = evenSum + index;
			else 
				oddSum = oddSum + index;
		}
		if(oddSum > evenSum)
			difference = oddSum - evenSum;
		else
			difference = evenSum - oddSum;
		System.out.println("Difference between Sum of Odd and Even Numbers is: "+difference);
	}
	
	public static void main(String[] args)
	{
		Assignment4 assignment4 = new Assignment4();
		assignment4.displayNumbers(10, 50);
		assignment4.displayNumbers2(10, 30);
		assignment4.sumOfRange(1, 5);
		assignment4.differenceSumOfEvenOdd(1, 8);
	}
}