package shruti;

public class LoopPractice {
	void divBySevenAndThirteen( int startRange, int endRange) {
		int count = 0;
		for( int i = startRange ; i<=endRange ; i++) {
		    if(i%7==0) {
			    System.out.println(i + " is divisible by 7");
		       	count++;
		    }
		
	    	else if(i%13==0) {
			      System.out.println(i + " is divisible by 13");
			      count++;
	    	}
		    if(count==5)
			   break ;
		}
	}

	
	 void printOddNo( int start, int end) {
		 int count = 0;
		 for(int i = end ; i>=start ; i-- ) {
			 if(i%2!=0) {
				 System.out.println("odd no. " + i);
				 count++;
			 }
			 if(count==3)
				 break;
		 }
	 }
	 void sumNo(int start ,int end) {
		 int sum = 0;
	 
		 for(int i = start ; i<=end ; i++) {
			 sum = sum+i;
		 }
		 System.out.println("sum is " + sum);
	 }
	 public static void main(String[] a) {
		 LoopPractice loopPractice = new LoopPractice();
		 loopPractice.divBySevenAndThirteen(5, 40);
		 loopPractice.printOddNo(10,20);
		 loopPractice.sumNo(1, 5);
	 }
		 
}
	 

	 
			
		 
	 
	 
		 
		 
	
		
			


