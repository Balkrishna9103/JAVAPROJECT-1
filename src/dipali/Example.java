package dipali;
class Example{ 
      void divisibleby(int startnum,int endnum,int n1,int n2,int totalnum){
	     int count=0;
		 for(int num=startnum;num<=endnum;num++){
		     if(num%n1==0 || num%n2==0){
				 if(num%n1==0){
			     System.out.println("Number" +num+"is divisible by " +n1);
			}else{
                 System.out.println("Number" +num+"is divisible by " +n2);			
             }
                 count++;
 				 if(count==totalnum)
				 break;
			}
         }
     }
       void reverseoddnum(int startnum,int endnum,int totalnum){
         int count=0;
         for(int num1=endnum;num1>=startnum;num1--){	
             if(num1%2!=0){
                 System.out.println(num1);
                 count++;
             }
              if(count==totalnum)
                 break;
         }  
	   }	 
       void sumofnum(int startnum,int endnum){
              int sum=0;
              for(int num1=startnum;num1<=endnum;num1++){
                 sum=sum+num1;
              }
                 System.out.println("sum of all number is" +sum);
             }
       public static void main(String[] args){
                 Example example=new Example();
                 example.divisibleby(7,40,8,13,5);
                 example.reverseoddnum(10,20,5);
				 example.sumofnum(1,9);
				 }
         }				 
				 