package dnyaneshari;

class GrpOperation{
          void evenodd(int sindex,int eindex ){
				  int even=0;
				  int odd=0;
				     for(int i=sindex;i<=eindex;i++){
				  
				          if(i%2==0){
					  		         even=even+i;
					                 System.out.println("Number "+i+" is even number");
					  	  }
						  else{
							  odd=odd+i;
							  System.out.println("Number "+i+" is odd number");
						  }
						   
					 }
                     System.out.println("Difference between sum of even and odd numbers = "+(even-odd));
					 System.out.println("----------------------------"); 
                }
		  
          void summation(int startrange,int endrange){
		           int sum=0;
		           for(int num=startrange;num<=endrange;num++){
				               sum=sum+num;
			                  }
		                 System.out.println("summation of all numbers are "+sum);
						 System.out.println("----------------------------"); 
		          }		  
			
		  void divisible(int startindex,int endindex){
		   
		       for(int i=startindex;i<=endindex;i++){
		   
		             if (i%3==0 && i%5==0){
					 
					   System.out.println("Number " + i+" is divisible by 5 and 3");
					 }
		       }
			  System.out.println("----------------------------");  
		  }
			
			 
			
		  void numbers(int startwith,int endwith){
			
			for(int num=startwith; num<=endwith; num++){
			
			   if (num%5==0){
			   
			         System.out.println("Number "+num+" is divisible by 5");
			        }
			 
			   }
		  }
			   
			   public static void main(String[] args){
			               GrpOperation grpoperation=new GrpOperation();
						   grpoperation.evenodd(1,20);
						   grpoperation.summation(20,30);
						   grpoperation.divisible(25,75);
						   grpoperation.numbers(1,50);
			   
			   
			   
			   
			   }
			   
}			   