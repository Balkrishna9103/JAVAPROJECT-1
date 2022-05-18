package alka;

public class Test1 {
	void divBy3and5(int strange,int endrange)
	{
	  for(int index=strange; index<=endrange;index++)
	  {
		  if(index % 3 ==0 || index % 5 ==0)
		  {
			  if(index % 3 ==0  && index % 5 ==0)
			  {
                 System.out.println(index + " is divisible by 3 and 5");	
			  }
			  else if(index % 5 ==0)
			    {
				  System.out.println(index + " is divisible by " + 5);
			    }
			  else
			  {
				  System.out.println(index + " is divisible by " + 3);
			  }
		  }
		  
		  
	  }
	}
	
	public static void main(String[] args)
	{
		Test1 test1=new Test1();
		test1.divBy3and5(1, 100);
	}
}
