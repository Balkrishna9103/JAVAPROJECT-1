package shraddha;

class Assignment13
{
	void divisibleby5(int startRange, int endRange)
	{
		System.out.println("1. Divisible by 5, numbers are:");
		for(int index=startRange;index<=endRange;index++)
		{
			if(index%5==0)
			{
			System.out.println("- " +index);
			}
		}
	}
	
	void divisibleby5and3(int startRange, int endRange)
	{
		System.out.println("2. Divisible by 5 and 3, numbers are:");
		for(int index=startRange;index<=endRange;index++)
		{
			if(index%5==0 && index%3==0) 
			{
			System.out.println("- " +index);
			}
		}
	}
	
	void numbersSum(int startRange, int endRange)
	{
		System.out.println("3. Sum of all the numbers in user define range:");
		int sum=0;
		for(int index=startRange;index<=endRange;index++)
		{
			sum = sum+index;
		}
		System.out.println("Sum is " +sum);
	}
	
	void differenceOfoddeven(int startRange, int endRange)
	{
		int evenSum=0;
		int oddSum=0;
		int difference=0;
		for(int index=startRange;index<=endRange;index++)
		{
			if(index%2==0)
				evenSum = evenSum+index;
			else
				oddSum = oddSum+index;	
		}
		difference = oddSum-evenSum;
		System.out.println("4. Difference between sum of odd numbers and even numbers is : " +difference);
	}

	public static void main(String[] args)
	{
		Assignment13 display = new Assignment13();
		System.out.println("Assignment 4 - 12 Apr 2022 " );
		System.out.println();
		display.divisibleby5(10,30);
		display.divisibleby5and3(5,18);
		display.numbersSum(1,5);
		display.differenceOfoddeven(3,9);
	}
}
			