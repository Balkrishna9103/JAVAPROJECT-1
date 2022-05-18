package shraddha;

class Assighment5
{
	void divisibleBy7or13(int startRange,int endRange)
	{
		int count=0;
		System.out.println("1. First 5 number which is divisible by 7 or 13: ");
		for(int index=startRange;index<=endRange;index++)
		{
			if(index%7==0 || index%13==0)
			{
				System.out.println(index +" is divisible by " +index);
				count++;
			}	
			if(count==5)
			{
				break;
			}
		}
	}
	
	void oddNumber(int endRange, int startRange)
	{
		int count=0;
		System.out.println("2. First 3 odd numbers in reverse order: ");
		for(int num=endRange;num>=startRange;num--)
		{
			if(num%2!=0)
			{
				System.out.println(num);
				count++;
			}	
			if(count==3)
			{
				break;
			}
				
		}	
	}
	
	void sumofNumbers(int startRange, int endRange)
	{
		int sum=0;
		System.out.println("3. Sum of all the numbers: ");
		for(int index=startRange;index<=endRange;index++)
		{
				sum=sum+index;
		}
		System.out.println("sum is " +sum);
	}
	
	void countOfNumbers(int startRange, int endRange)
	{
		int count=0;
		System.out.println("4. Count all numbers which is divisible by 7 or 13: ");
		for(int index=startRange;index<=endRange;index++)
			if(index%7==0 || index%13==0)
			{
				count++;
			}	
			System.out.println("Count is: " +count);
	}
	
	public static void main(String[] args)
	{
		Assighment5 assighment = new Assighment5();
		System.out.println();
		assighment.divisibleBy7or13(5,40);
		System.out.println();
		assighment.oddNumber(20,10);
		System.out.println();
		assighment.sumofNumbers(1,5);
		System.out.println();
		assighment.countOfNumbers(5,40);
		System.out.println();
	}
	
}