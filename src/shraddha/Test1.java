package shraddha;

class Test1
{
	void divBy3(int stratRange, int endRange)
	{
		for(int index=1;index<=100;index++)
		{
			if(index%3==0)
			{
				System.out.println(+index +" is divisible by 3");
			}
			if(index%5==0)
			{
				System.out.println(+index +" is divisible by 5");
			}
			if(index%3==0 && index%5==0)
			{
				System.out.println(+index +" is divisible by 3 and 5");
			}	
			else if (index>30)
			break;
		}
	}				

	public static void main(String[] args)
	{
		Test1 test = new Test1();
		test.divBy3(1,100);
	}
}