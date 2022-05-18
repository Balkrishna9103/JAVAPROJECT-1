package shraddha;

class Assighment6
{
	void genrateSum()
	{
		int num = 0;
		int sum = 0;
		
		while(sum<=100)
		{
			num++;
			sum = sum + num;		
		}	
		System.out.println("1. Method to find out minimum required numbers to generate sum 100: " +num);
	}
	
	void divisibleBy7or13()
	{
		int count=0;
		int startRange=5;
		int endRange=40;
		System.out.println("2. First 3 number which is divisible by 17 or 13: ");
		
		while (startRange<=endRange)
		{
			if(startRange%17==0 || startRange%13==0)
			{
				System.out.println(startRange +" is divisible by " +startRange);
				count++;
			}
			startRange++;
			
			if(count == 3)
			{
				break;
			}
		}
	}
	
	void divisibleBy5and7()
	{
		int count=0;
		int startRange=5;
		int endRange=100;
		System.out.println("3. First 2 number which is divisible by 5 or 7: ");
		
		while (count<=2 && startRange<=endRange)
		{
			if(startRange%5==0 && startRange%7==0)
			{
				System.out.println(startRange);
				count++;
			}	
			startRange++;
			
			if(count == 2)
			{
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Assighment6 assighment = new Assighment6();
		System.out.println();
		assighment.genrateSum();
		System.out.println();
		assighment.divisibleBy7or13();
		System.out.println();
		assighment.divisibleBy5and7();
		System.out.println();
	}
}