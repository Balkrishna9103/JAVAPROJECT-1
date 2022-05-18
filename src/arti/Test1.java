package arti;

public class Test1 {
	
	void divBy(int startIndex,int endIndex)
	{
		for(int index=startIndex;index<=endIndex;index++)
		{
			if(index%3==0 && index%5==0)
				System.out.println(index + "is divisible by 3 and 5");
			else
			{
				if(index%3==0)
				System.out.println(index + "is divisible by 3");
				if(index%5==0)
				System.out.println(index + "is divisible by 5");
			}
		}
	}
	public static void main(String args[])
	{
		Test1 test1=new Test1();
		test1.divBy(1,100);
	}
}
