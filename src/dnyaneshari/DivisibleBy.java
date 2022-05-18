package dnyaneshari;

class DivisibleBy{
       
	  void divide(int startR,int endR,int totalNumber){
		  int count=0;
	       while(startR<=endR){
			   startR++;
		         if(startR%13==0){
					 System.out.println(startR +" is divisible by 13");
					 count++;
				 }
				 else if(startR%17==0){
					  System.out.println(startR +" is divisible by 17");
					  count ++;
				 }
				 if(count==totalNumber)
					 break;
		   }
	  }
	  
	  void divideby(int startR,int endR){
		  int count=0;
		  while(startR<=endR){
			  startR++;
			  if(startR%5==0 && startR%7==0){
				  System.out.println("Number "+startR+" is divisible by 5 and 7");
				  count++;
		      }
			  if(count==2)
				  break;
		  }
		  
	  }
	  
	  void sum(){
		  int sum=0;
		  int num=1;
		  while(sum<=100){
			   num++;
			  sum=sum+num;
		  }
		  System.out.println("Total number of numbers are"+num);
	  }
	   public static void main(String[] args){
			
	              DivisibleBy divisibleby = new DivisibleBy();
				  divisibleby.divide(1,40,3);
				  divisibleby.divideby(5,100);
				  divisibleby.sum();
           }
}


       