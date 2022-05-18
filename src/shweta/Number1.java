package shweta;

class Number1{
    int index;int count=0;
	
    void divBy7(int startRange,int endRange){
	    for(index=startRange;index<=endRange;index++){
	        if( index % 7 ==0 )
	          System.out.println(index+" is divisible by 7");
			else if(index % 13 ==0)	
              System.out.println(index+" is divisible by 13");			    
	    }
              System.out.println("-----------------------------------------");		
	}
	void reverse(int startRange,int endRange,int expnum){
		System.out.println("First 3 odd numbers in reverse order are");
		for(index=endRange;index>=startRange;index--){
		    if (index %2 != 0){	
			  System.out.println(index);
		      count++;
		     }				
		    if(count==expnum)
			  break;
		}
		     System.out.println("-----------------------------------------");		
	}	
	void Addition(int startRange,int endRange){
	int sum=0;
		for(index=startRange;index<=endRange;index++){
			  sum= sum+ index;
		}
		      System.out.println("sum is "+sum);
			  System.out.println("-----------------------------------------");
		
	}
		
	void count(int startRange,int endRange){
	int count=0;
		for(index=startRange;index<=endRange;index++){
		    if( index % 7 ==0 || index % 13==0 ){
			  count++;
		    }
		} 
		    System.out.println("Total count of number divisible by 7 or 13 is "+count);
		    System.out.println("-----------------------------------------");
				 
	}
	
	public static void main (String[] args){
	Number1 number = new Number1();
	number.divBy7(5,40);
	number.reverse(10,20,3);
	number.Addition(1,5);
	number.count(5,40);
		
	}
}
