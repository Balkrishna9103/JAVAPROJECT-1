package jalpa ;

class Assignment5 {
	
	int index ;
	void divisible(int start, int end ){
		int count = 0 ;
		for(int index=start;index<=end;index++){
			if(index % 7 == 0){
				System.out.println(index+ "divisible by 7");
				count++;
			}
			else if (index % 13 == 0){
				System.out.println(index+ "divisible by 13");
				count++;
			}
			if(count > 4){
				break;
			}
		}
	}
		
	void oddNumbers(int start , int end){
		int count = 0;
		System.out.println("First 3 numbers in reverse order");
			for (index=end ; index>=start ; index--){
			if (index%2!=0){
				System.out.println(index);
				count++;
			}				
			if(count==3){
				break;
			}
			
		}	
	}
	
	void add (int start , int end){
		int sum = 0;
		for (index=start ; index<= end; index++){
			sum=sum+index ;
		}
			System.out.println("Addition of 1 to 5 Numbers in loop is : "+sum);
	}
	
	void count (int start , int end){
		int count=0;
		for (index=start ; index<=end ; index++){
			if (index%7==0 || index%13==0)
				count++;
		}
			 System.out.println("Total number of count divisible by 7 & 13 is: " + count);
		  
	}
	public static void main (String [] args){
		Assignment5 assignment5 = new Assignment5 ();
		assignment5.divisible(5,40);
		assignment5.oddNumbers(10,20);
		assignment5.add(1,5);
		assignment5.count(5,40);
	}
}