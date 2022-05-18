package akshayM;

class Assignment6{
	void displaySum()
	{
		int sum = 0;
		int num = 0;
		while(sum<=100)
		{
			num++;
			sum = sum + num;
		}
		System.out.println("output: "+num);
		System.out.println();
	}
	
	void printDivisibleNumber(int startRange, int endRange)
	{
		int count = 0;
		while(startRange<=endRange)
		{
			if(startRange%13 == 0){
				System.out.println(startRange+ " is divisible by 13");
				count++;
			}
			else if(startRange%17 == 0){
				System.out.println(startRange+ " is divisible by 17");
				count++;
			}
			startRange++;
			if(count == 3)
				break;
		}
		if(count < 3)
			System.out.println("We couldn't find 5 numbers which is divisible by 13 and 17 in given range, we could only find " + count + "numbers");			
	}
	
	void divisibleByFiveAndSeven(int startRange, int endRange)
	{
		int count = 0;
		System.out.println();
		System.out.println("Numbers divisible by 5 and 7 are:");
		while(startRange <= endRange)
		{
			if(startRange%5 == 0 && startRange%7 == 0)
			{
				System.out.println(startRange);
				count++;
			}
			startRange++;
		}
	}
			
	public static void main(String[] args)
	{
		Assignment6 assignmnet6 = new Assignment6();
		assignmnet6.displaySum();
		assignmnet6.printDivisibleNumber(5, 40);
		assignmnet6.divisibleByFiveAndSeven(5, 100);
	}
}