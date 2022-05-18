package sameer;

class Assignment6
{
	public static void main(String [] args)
	{
		Assignment6 assignment6 = new Assignment6();
		assignment6.sum();
		assignment6.divisibleMethod(5,40);
		assignment6.divisibleMethod1(5,100);
	}
	
	void sum()
	{
		int sum = 0;
		int num = 1;
		while(sum<=100)
		{
			num++;
			sum = sum + num;
		}
		System.out.println(num);
		System.out.println("-------------------------------------------");
	}
	
	void divisibleMethod(int startRange, int endRange)
	{
		int count = 0;
		while(startRange<=endRange)
		{
			if(startRange % 13==0)
			{
				System.out.println(startRange+ " is devisible by 13");
				count++;
			}
			else if(startRange % 17 ==0)
			{
				System.out.println(startRange+ " is devisible by 17");
				count++;
			}
			startRange++;
			if(count==3)
				break;
		}
		System.out.println("-------------------------------------------");
	}
	
	void divisibleMethod1(int startRange, int endRange)
	{
		int count = 0;
		while(count<2)
		{
			if(startRange % 5 ==0 && startRange % 7 ==0)
			{
				System.out.println(startRange);
				count++;	
			}
			startRange++;
		}
		System.out.println("-------------------------------------------");
	}
}












