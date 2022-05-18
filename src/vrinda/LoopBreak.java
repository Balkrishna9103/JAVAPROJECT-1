package vrinda;

class LoopBreak
	{
		void DivisibleOrOpratore(int startRange, int endRange)
		{
			int count=0;
			for(int num=startRange;num<=endRange;num++)
				{
				    if(num%7==0)
					{
					  System.out.println(num+"  is divisible by 7");
					  count++;
					}
					else if(num%13==0)
					{
					  System.out.println(num+"  is divisible by 13");
					  count++;
					}
					if(count==5)
					{
						break;
					}
				}
		}
		
		void oddNumber(int startRange,int endRange,int count)
		{
			System.out.println("Odd numbers are:");
			int count1=0;
			for(int num=endRange;num>=startRange;num--)
			{
			
			if(num%2!=0)
			{
			   System.out.println(num);
			   count1++;
			}
			if(count1==count)
				break;
			}
		}
		
		void sumOfNum(int startRange,int endRange)
	{
		int sum=0;
		for(int num=startRange;num<=endRange;num++)
		{
			sum=sum+num;
		}
		System.out.println("Sum is "+sum);
		
	}
		void countOfEvenOdd(int startRange,int endRange)
	{
		int count=0;
	
		for(int num=startRange;num<=endRange;num++)
		{
			if(num%7==0||num%13==0)	
			{
			count++;
			}
			
		}
		System.out.println("divisible by 7 or 13:  "+"Count="+count);
	}
		
	public static void main(String[] args)
		{
			LoopBreak loopBreak=new LoopBreak();
				loopBreak.DivisibleOrOpratore(5,40);
				loopBreak.oddNumber(10,20,3);
				loopBreak.sumOfNum(1,5);
				loopBreak.countOfEvenOdd(5,40);
		}
		
		
		
	}
				