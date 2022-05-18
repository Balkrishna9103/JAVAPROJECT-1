package alka;
class Forbreaknew
{
	void divBy7or13(int startindex,int endindex)
	{
		int count=0;
		for(int index=startindex; index<=endindex ;  index++ )
		{
			if(index % 7==0 || index % 13==0)
			{
				if((index % 7==0))
				   System.out.println(index +" is divisible by "+ 7  );
			       
		        else
				   System.out.println(index +" is divisible by "+ 13  );
			       count++;
			       if(count >4)
				   break;
			}
		}
		System.out.println();
	}
	
	void printoddno(int startindex,int endindex)
	{
		int count=0;
		for(int index=endindex; index >=startindex; index-- )
		{
			if(index%2 !=0)
			{
				count++;
			System.out.println(index);
			}
		     
            if(count >2)
				
            break; 				
			
		}
		System.out.println();
	}
	
	void Sumofallno(int startindex,int endindex)
	{
		  int sum=0;
		 
		  for(int index=startindex;index<=endindex;index++)
		  {
			  sum=index+sum;
			 
		  }
		 System.out.println("sum is "+sum);
		 System.out.println();
	}
	
	void countdivBy7or13(int startindex,int endindex)
	{    int count=0;
		for(int index=startindex; index<=endindex;index++)
		{   
			if(index % 7==0  || index % 13== 0 )
			{
				count++;
			}
		}
		System.out.println("Divisible by 7 or 13,count is: " +count);
	}	
	
	
	public static void main(String[] args)
	{
		Forbreaknew forbreaknew =new Forbreaknew();
		forbreaknew.divBy7or13(5,40);	
        forbreaknew.printoddno(10,20);	
		forbreaknew.Sumofallno(1,5);
		forbreaknew.countdivBy7or13(5,40);
	}
}