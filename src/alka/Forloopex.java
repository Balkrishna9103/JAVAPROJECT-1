package alka;
class Forloopex
{
	void divBy5(int startindex,int endindex)
	{
		for(int index =startindex; index<=endindex ; index++ )
		{
			if(index % 5 == 0)
			{
             System.out.println("Divisible by 5,numbers are " + index );
			 
			}			 
		}
		
	}
	void divBy5and3(int startindex,int endindex)
	{
       		for(int index=startindex; index<=endindex ;index++)
			{
				if((index % 5 == 0)&&(index % 3 == 0)  )
				{
                     	    System.out.println("Divisible by 5 and 3,numbers are " + index );				
				}
			}
	}
	
	
	void sumOfall(int startindex ,int endindex)
	{
		        int sum=0;
          		for(int index =startindex; index<=endindex ;index++)
				{
					sum=sum + index;
				}
				System.out.println("sum of all numbers is " + sum );				
	}
	void Diff(int startindex,int endindex)
	{
		int sumEven=0;
		int sumOdd=0;
		for(int index=startindex; index<= endindex ;index++)
		{
            		if(index % 2 ==0)
					{
						sumEven= sumEven + index;
						
					}	
                    else
					{
						sumOdd=sumOdd + index;
					}						
		}
		
		System.out.println("Diff of Sum of Odd  numbers and even numbers is " + (sumOdd-sumEven) );				
	}
	
	public static void main(String[] args)
	{
		Forloopex   forloopex  =new Forloopex();
		forloopex.divBy5(10,30);
		forloopex.divBy5and3(5,18);
		forloopex.sumOfall(1,5);
		forloopex.Diff(3,9);
	}
}