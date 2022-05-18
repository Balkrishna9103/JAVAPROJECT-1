package vrinda;

class Methods{

	void divisibleData(int startRange,int endRange)
		{
			if(startRange<endRange)
			{
			System.out.println("Divisible by 5 numbers are:");
			for(int num=startRange;num<=endRange;num++)
				{
					if(num%5==0)
					{
					System.out.println(num);
					}
				}
			}
			else
			{
				System.out.println("Invalid Data");
			}
		}

	
		
	void divisibleData1(int startRange,int endRange)
	{
			for(int num=startRange;num<=endRange;num++)
			{
				if(num%3==0&&num%5==0)
				System.out.println("Divisible by 5 & 3 ,numbers are "+num);
			}
	}
	
	
	void sumOfNum(int startRange,int endRange)
	{
		int sum=0;
		for(int num=startRange;num<=endRange;num++)
		{
			sum=sum+num;
		}
		System.out.println("Sum of 1-5 numbers are "+sum);
	}
	
	
	void sumOfEvenOdd(int startRange,int endRange)
	{
		int sumofevenno=0;
		int sumofoddno=0;
		for(int num=startRange;num<=endRange;num++)
		{
			if(num%2==0)	
			{
			sumofevenno=sumofevenno+num;
			}
			else 
			{
				sumofoddno=sumofoddno+num;
			}
		}
		System.out.println("Sum of Even and Odd numbers are "+sumofevenno+sumofoddno);
	}
public static void main(String[] arsg)
		{
			Methods methods=new Methods();
			methods.divisibleData(10,30);
			methods.divisibleData1(5,18);
			methods.sumOfNum(1,5);
			methods.sumOfEvenOdd(3,9);
		}
}
	