package sameer;

class Example10
{
	void display()
	{
		for(int index=1;index<=10;index++)
		{
			System.out.println("Maulik-" +index);
		}	
	}
	void revDisplay(String name)
	{
		for(int index=100;index>=1;index--)
		{
			System.out.println(name+" - " +index);
		}	
	}
	
	void processData(String name, int startRange, int endRange)
	{
		for(int index=endRange;index>=startRange;index--)
		{
			System.out.println(name+" - " +index);
		}
	}
	void doSum()
	{
		int sum=0;
		for(int i=1; i<=5;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}
	
	public static void main(String [] a)
	{
		Example10 example10= new Example10();
		//example10.display();
		//example10.revDisplay("Sameer");	
		example10.processData("Harshada",5,12);
	}
}