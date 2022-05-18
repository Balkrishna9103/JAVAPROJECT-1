package keshav;

/*1. On user define range print first 5 number which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13*/

class Example15{
	
	void printData(int startR, int endR){
		
		int count=0;
		
		while(startR<=endR){
			if(startR%17==0){
				System.out.println(startR + " is divisible by 7");
				count++;
			}else if(startR%13==0){
				System.out.println(startR + " is divisible by 13");
				count++;
			}
			startR++;
			
			if(count == 5){
				break;
			}
		}
		
		if(count < 5){
			System.out.println("We couldn't find 5 numbers which is div by `7 or `3 in given range, we could only find " + count + " numbers");
		}
		
		for(;startR<=endR;startR++){
			if(startR%7==0){
				System.out.println(startR + " is divisible by 7");
				count++;
			}else if(startR%13==0){
				System.out.println(startR + " is divisible by 13");
				count++;
			}
			if(count == 5){
				break;
			}
		}
		
	}
	
}