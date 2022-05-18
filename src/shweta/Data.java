package shweta;

class Data{
   int count=0;
   int sum=0;

 
   void minimum(int startR,int endR){
     while(sum<=100){
		 count++;
	sum =sum+count;
	  
 } 

System.out.println("Minimum number required to generate sum=100 is "+count);
	}
   
   void first3(int startR,int endR){
	 
	   while( startR<=endR && count<=3){
		   if(startR %17==0){
			 System.out.println(startR+"is divisible by 17");
             count++;	
		   }			 
		   else if (startR %13==0){
		  System.out.println(startR+"is divisible by 13");
		   count++;
		   }
		  
		  startR++;
		  if(count==3)
			  System.out.println("halt");
			     
	   }
	  
	   
   }
   
   void print2(int startR,int endR){
     if(startR %5==0 || startR %7==0){
        System.out.println(startR);
	 }
   }
   
   public static void main(String[] args){
	   
     Data data=new Data();
   data.minimum(1,100);
     data.first3(5,40);
   //data.print2(5,100);
   }
   
}