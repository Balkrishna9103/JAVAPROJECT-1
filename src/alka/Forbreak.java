package alka;
class Forbreak
{
	void divBy7or13(int startindex,int endindex)
	{
		//int count=0;
		for(int index=startindex; index<=endindex ;  index++ )
		{
			if(index % 7==0 || index % 13==0)
			{
				//System.out.println(index % 7==0);
				if((index % 7==0)==true)
				{
					System.out.println("hi");
					System.out.println("hi");
				}
				//System.out.Println(index +" is divisible by "+ 7  );
			    	//	if((index % 13==0)==true)
				//System.out.Println(index +" is divisible by "+ 13  );
			//count++;
			//if(count >4)
				//break;
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Forbreak forbreak =new Forbreak();
		forbreak.divBy7or13(5,40);		
	}
}