package shweta;
class Whileloop{
  int num=0;
  int sum=0;
  
  void minimum(){
      while(sum<=100){
		 num++;
         sum=sum+num;
      }
        System.out.println("Minimum Required number  is "+num); 
  }   
  void printFirst3(int startR,int endR){
  int count=0;
	  while(startR<=endR){
	    if(startR%13==0){
		  System.out.println(startR+"is divisible by 13");
		  count++;
	    }
	    else if (startR%17==0){
		  System.out.println(startR+"is divisible by 17");
		  count++;
	    }
	      startR++;
	    if(count==3)
		  break;
	  } 
	  
  }
  void printFirst2(int startR,int endR){
  int count=0;
	  while(startR<=endR){
	    if(startR %5==0 &&  startR %7==0){
		  System.out.println(startR);
		  count++;
	    }
		 startR++;
	    if(count==2)
		  break;
	 }
  }
  
  public static void main(String[] args){
  Whileloop whileloop= new Whileloop();
  whileloop.minimum();
  whileloop.printFirst3(5,40);
  whileloop.printFirst2(5,100);
  
  }
}