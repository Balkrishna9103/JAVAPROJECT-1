package alka;
class whilenew
{
	
	void minRequiredno()
	{   int count=0;
	    int sum=0;
		//int minreqno=0;
		
		
		while(sum<=100)   
		{
			count++;
			sum=sum+count;    
		
	    }
		System.out.println(count); 
		System.out.println(); 
	}
	
	void NoDivisibleby17or13(int startindex,int endindex)
	{ 
	
	int countno=0;
		
	while(startindex <=endindex)
		{
		if(startindex % 17==0)
		{
			System.out.println(startindex + " is divisible by " +  17);
			countno++; 
			
		}
		if(startindex % 13==0)
		{
				System.out.println(startindex + " is divisible by " +  13);
			countno++; 
			
		}
		startindex++;
		 if(countno ==3)
			 break;
		}
		System.out.println(); 
	}
	
	void nodivby5and7(int startindex,int endindex)
	{
		int count=0;
		while(startindex<=endindex)
		{
			if(startindex % 5==0 && startindex%7==0 )
			{
				System.out.println(startindex);
				count++;
			}
			
			startindex++;
			if(count ==2)
				break;
		}
		System.out.println(); 
		
	}	
	
	
	
	public static void main(String[] args)
	{
		whilenew whilenew=new whilenew();
		
		whilenew.minRequiredno();
		whilenew.NoDivisibleby17or13(5,40);
		whilenew.nodivby5and7(5,100);
	}
}

//On user define range print first 3 number which is divisible by 17 or 13. 
//Hint : pass start and end index as a parameter.
//Input : Range -> 5 to 40
