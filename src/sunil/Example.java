package sunil;

class Example
{	
	int num1=10;
	int num2=20;
	
	void updateNumbers()
	{
		num1 = 10;
		num2 = 20;
	}
	
	void processdata()
	{
		System.out.println(num1+ num2);
	}
	
	public static void main(String[] args)
	{
		Example example = new Example();
		example.updateNumbers();
		example.processdata();	
	}
}


