package akshayM;

class Assignment5{
	void printNumber(int startRange, int endRange)
	{
		int count = 0;
		for(int index = startRange; index <= endRange; index++)
		{
			if(index% 7 == 0 || index% 13 ==0)
			{
				if(index %7 == 0)
					System.out.println(index+" is divisible by 7");
				else
					System.out.println(index+" is divisible by 13");
				count++;
			}
			if(count == 5)
				break;
		}
	}
	
	void printOddNumberRevOrder(int startRange, int endRange)
	{
		System.out.println("Odd numbers are:");
		int count = 0;
		for(int index = endRange; index >= startRange; index--)
		{
			if(index%2 !=0)
			{
				System.out.println(index);
				count++;
			}
			if(count == 3)
				break;
		}
	}
	
	void sumOfNumbers(int startRange, int endRange)
	{
		int sum = 0;
		for(int index= startRange; index<=endRange; index++)
			sum = sum + index;
		System.out.println("Sum is "+sum);
	}
	
	void countNumbers(int startRange, int endRange)
	{
		int count = 0;
		for(int index = startRange; index<= endRange; index++)
		{
			if(index%7 == 0 || index%13 == 0)
				count++;
		}
		System.out.println("Divisible by " +startRange+ " or " +endRange+", Count is :" +count);
	}
			
	public static void main(String[] args)
	{
		Assignment5 assignment5 = new Assignment5();
		assignment5.printNumber(20, 50);
		assignment5.printOddNumberRevOrder(10,30);
		assignment5.sumOfNumbers(1,5);
		assignment5.countNumbers(5, 40);
	}
}