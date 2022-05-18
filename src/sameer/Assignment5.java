package sameer;

class Assignment5
{
	public static void main(String [] a)
	{
		Assignment5 assignment5 = new Assignment5();
		assignment5.devisibleBySevenAndThirteen(5,40);
		assignment5.reverseOddNumber(10,20);
		assignment5.sum(1,5);
		assignment5.countNumber(5,40);
	}
	
	void devisibleBySevenAndThirteen(int startIndex, int endIndex)
	{
		int count=0;
		for(int index= startIndex;index<=endIndex;index++)
		{
			if(index % 7==0 || index % 13==0)	
			{
				if(index % 7==0)
				{
					System.out.println(index +" is devisible by 7");
				}
				else
				{
					System.out.println(index +" is devisible by 13");
				}
				count++;
			}
			if(count==5)
			break;
		}
		System.out.println("------------------------------------------------------------");
	}
	
	void reverseOddNumber(int startIndex, int endIndex)
	{
		int count=0;
		System.out.println("First 3 odd numbers are ");
		for(int index=endIndex;index>=startIndex;index--)
		{
			if(index % 2 !=0)
			{
				System.out.println(index);
				count++;
			}
			if(count==3)
			break;
		}
		System.out.println("------------------------------------------------------------");
	}
	
	void sum(int startIndex, int endIndex)
	{
		int sum=0;
		for(int index= startIndex;index<=endIndex;index++)
		{
			sum = sum +index;
		}
		System.out.println("Sum is "+sum);
		System.out.println("------------------------------------------------------------");
	}
	
	void countNumber(int startIndex, int endIndex)
	{
		int count = 0;
		for(int index=startIndex; index<=endIndex; index++)
		{
			if(index % 7==0 || index % 13 ==0)
			{
				count++;
			}
		}
		System.out.println("Number devisible by 7 and 13 is "+count);	
		System.out.println("------------------------------------------------------------");
	}
}