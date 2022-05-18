package poojaK;
class Assignment{
	void divisibleNumber(int startRange, int endRange)
	{ 	
		for (int num=10;num<=30;num++)
		{	if(num%5==0)	
			System.out.println(num + " is divisible by 5");
		}
		System.out.println("***********************************");
	}
	void multiple(int startRange, int endRange)
	{ 	
		for (int num=5;num<=18;num++)
		{	if(num%3==0 && num%5==0)	
			System.out.println(num + " is Divisible by 3 and 5"); 
		}
		System.out.println("***********************************");
	}
	void sumNumber()
	{int sum=0;
		for (int num=1;num<=5;num++)
		{
			sum = sum +num;
			
		}
		System.out.println("Sum of five numbers is " + sum);
		System.out.println("***********************************");
	}
	void oddEvenNumber()
	{ 	int even=0;
		int odd=0;
		int div=0;
		for (int i=3;i<=9;i++)
			{		
				if (i%2==0)
					even = even + i;
			}
		for (int j=3;j<=9;j++)	
		{
			if (j%2!=0)
				odd = odd + j;
					
		}
		div = odd - even;
		System.out.println("odd and even diff is  " + div);
	}
	public static void main(String[] args){
		Assignment assignmentFour = new Assignment();
		assignmentFour.divisibleNumber(10,30);
		assignmentFour.multiple(5,13);
		assignmentFour.sumNumber();
		assignmentFour.oddEvenNumber();
	}
}