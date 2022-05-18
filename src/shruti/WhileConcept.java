package shruti;
class WhileConcept{
    int sum = 0;
	  int num = 0;
    void minimumCount(){
	        while(sum<=100){
			      num++;
				  sum = sum + num;
		    }
			System.out.println("Minimum required numbers  " + num);
	  }
	  void processData(int start , int end){
		  int count = 0;
	       while(start <= end){
				 if(start%17==0){
					System.out.println(start + " is divisible by 17");
				    count++;
				 }
				 else if(start%13==0){
					  System.out.println(start + " is divisible by 13");
				      count++;
				 }
				 if(count == 3)
				    break;
				 start++;
		   }
    }		  
    void divisibleByFiveOrSeven(int start, int end){
		
		int count=0;
		while(start<=end){			
			if(start%5==0 && start%7==0 ){
				System.out.println(start +  "  is divisible by 5 & 7");
				count++;			
			}
			if(count==2)
				break;
			start++;
		}	
	}
			
	public static void main(String[] args){	
		WhileConcept whileConcept = new WhileConcept();
		whileConcept.minimumCount();
		whileConcept.processData(5,40);
		whileConcept.divisibleByFiveOrSeven(5,100);
	}
}


	  
	  
	        


	  
	  
	        




		   

