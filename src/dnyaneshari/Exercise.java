package dnyaneshari;

class Exercise{ 
        void divisibleby(int startR,int endR,int num1,int num2,int totalNumber){
		         int count=0;
				 for(int range=startR;range<=endR;range++){
				     
					 if(range%num1==0 || range%num2==0){
					     if(range%num1==0){
							        if(range%num2==0){
									System.out.println("Number "+ range+" is divisible by "+num1+" and "+num2 );
									}else{
										 System.out.println("Number "+ range+" is divisible by "+num1);
									}
						 }else{
						       System.out.println("Number "+ range+" is divisible by "+num2);						 				 
						 }
					    
						 count++;
					      if(count==totalNumber)
							break;
					 }
				 }
                System.out.println("*************");				 
		    }
        
		void reverseoddnumber(int startR,int endR,int totalNumber){
			 int count=0;
			 for(int number=endR;number>=startR;number--){
			      
				 if(number%2!=0){
					 	System.out.println(number);
						count++;
				 }				
					
   					if(count==totalNumber)
						break; 	 
			 }
			 System.out.println("*************");	
		}
		
		void sumofall(int startR,int endR){
		     
			 int sum=0;
			 for(int number=startR;number<=endR;number++){
			          sum=sum+number;
			 }		 
			 System.out.println("sum of all number is "+sum);
		}
	
        public  static void main(String[] args){
		
		         Exercise exercise=new Exercise();
				 
				 exercise.divisibleby(5,50,7,13,5);
				 exercise.reverseoddnumber(10,20,3);
				 exercise.sumofall(1,100);
		
		}

}

         

