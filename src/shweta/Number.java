package shweta;

class Number{
	int sum=0;
	int count=0;
	int evenNumsum=0;
	int oddNumsum=0;
	int diff=0;

    void divByfive(int startRange,int endRange){
		
		
		for(int num =startRange;num<=endRange;num++){
			if(num % 5==0)
			{
				System.out.println("Divisible by 5, numbers are:"+ num);
				count++;	
			}    
		}
		        System.out.println("Total count of number which are divisible by 5 is  "+ count);
				System.out.println("----------------------------------------------------------------------------------------------------");
	
	}
	            
    void divByfiveAndthree(int startRange,int endRange){
		
		for(int num=startRange;num<=endRange;num++){
	       if(num %5 ==0 && num %3==0)
			{
				System.out.println("Divisible by 5 and 3 , numbers is :"+ num );
				count++;
	        }	
		}
		        System.out.println("Total count of number which are divisible by 5 and 3 is  "+ count);
				System.out.println("----------------------------------------------------------------------------------------------------");
	
	}	
		        
	void sumAll(int startRange,int endRange){
		for(int num=startRange;num<=endRange;num++){
		        sum=sum+num;   
	    }
		   System.out.println("Sum of All numbers is "+sum);
		   System.out.println("-----------------------------------------------");
	
	}
	
	
	void diffEvenOdd(int startRange,int endRange){
		
		for(int num=startRange;num<=endRange;num++){
		   if(num % 2== 0)
			   evenNumsum= evenNumsum + num;
		   
			else
				oddNumsum = oddNumsum + num;
			
		}
		diff= oddNumsum-evenNumsum;
		System.out.println("The difference between Even & Odd number is "+diff);
		System.out.println("----------------------------------------------------");
	}
	       
	public static void main (String[] args){
	Number number = new Number();
	
	number.divByfive(10,30);
	number.divByfiveAndthree(5,18);
	number.sumAll(1,5);
	number.diffEvenOdd(3,9);
	
	
	}
}
	
	