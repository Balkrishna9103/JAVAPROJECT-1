package shruti;

public class Assignment {
	void printNo( int startRange , int endRange) {
		for( int i= startRange ; i<= endRange ; i++ ) {
			if(i%5==0)
				System.out.println("Divisible by 5,numbers are " + i);
		}
		
	}
	void divByThreeAndfive(int start,int end) {
		for( int i= start ; i<= end ; i++ ) {
			if(i%3==0 && i%5==0) 
				System.out.println("Divisible by 3 and 5 , Numbers are " + i);
				
		}
	}
	void diffSumEvenAndEven( int start ,int end) {
		int sumEven = 0;
		int sumOdd = 0;
		  for( int i= start ; i<= end ; i++ ) {
				if(i%2==0)
					sumEven+= i;
				else
					sumOdd += i;
			}
		    if(sumEven > sumOdd ) 
		    	System.out.println("Difference between sumEven and sumOdd " + (sumEven-sumOdd));
		    else
		    	System.out.println("Difference between sumEven and sumOdd " + (sumOdd-sumEven));
		    
		    
	}
	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		assignment.printNo(10, 30);
		assignment.divByThreeAndfive(5,18 );
		assignment.diffSumEvenAndEven(3, 9);
	}
}
		
		
		                 
	   
	    
	    
	    
	    	
		
		
	


