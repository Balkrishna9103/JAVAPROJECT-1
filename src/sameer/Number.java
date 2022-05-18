package sameer;

class Number
{
	//Method to find number divisible by 5
	void divisibleByFive(int startIndex, int endIndex)
	{
		for(int i=startIndex;i<=endIndex;i++)
		{
			if(i%5==0)
			{
				System.out.println(i+" is divisible by 5");
				
			}
		}
		System.out.println("-------------------------------------------------------------");
	}
	//Method to find number divisible by 3 and 5
	void divisibleByFiveAndThree(int startIndex, int endIndex)
	{
		for(int i=startIndex;i<endIndex;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+" is divisible by 3 and 5");
			}
		}
		System.out.println("-------------------------------------------------------------");
	}
	//Method to display sum of numbers
	void sum(int startIndex, int endIndex)
	{
		int sum=0;
		for(int i=startIndex;i<=endIndex;i++)
		{
			sum = sum + i;
		}
		System.out.println("sum of number is "+sum);
		System.out.println("-------------------------------------------------------------");
	}
	//Method to get sum of Even and Odd number from given range and difference between sum of even and odd number
	void diffOfEvenOddNumber(int startIndex, int endIndex)
	{
		int sumOdd=0;
		int sumEven=0;
		for(int i=startIndex;i<=endIndex;i++)
		{
			if(i%2==0)
			{
				sumEven= sumEven + i;	
			}
			else
			{
				sumOdd= sumOdd + i;
			}
		}
		System.out.println("Sum of Even Number is "+sumEven);
		System.out.println("Sum of Odd number is "+sumOdd);
		System.out.println("Difference between Even and Odd number is "+(sumOdd-sumEven));
		System.out.println("-------------------------------------------------------------");
	}
	
	public static void main(String [] arg)
	{
		Number number =  new Number();
		number.divisibleByFive(10,30);
		number.divisibleByFiveAndThree(5,18);
		number.sum(1,5);
		number.diffOfEvenOddNumber(3,9);
	}
}



