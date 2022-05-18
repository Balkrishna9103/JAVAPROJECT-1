package sameer;

class NumberDivisible
{
	void divisible(String name, int startRange, int endRange)
	{
		int sum = 0;
		int count = 0;
		if(startRange < endRange)
		{
			for(int i= startRange;i<=endRange;i++)
			{
				if(i%3==0 && i%5==0)
				{
					sum =  sum + i;
					count++;
					System.out.println(i);
				}
			}
			System.out.println("Sum of numbers is "+sum);
				System.out.println("Count is "+count);
		}
		else
		{
			System.out.println("StartRange and EndRange is invalid");
		}
			
	}
	
	public static void main(String [] args)
	{
		NumberDivisible numberDivisible = new NumberDivisible();
		numberDivisible.divisible("Sameer",100,5);
	}
}