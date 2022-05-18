package ashish;

class AssignmentSix{
	
	void minReqNumToGenerateSumOfHundred(){			
		int num = 0;
		int sum = 0;
		while(sum <= 100){
			num++;  			 
			sum = sum + num; 
		}
		System.out.println("Minimum required numbers to generate sum 100 are: " + num);
		System.out.println("=================================");
	}	
	
	void printFirstThreeNumDivBySeventeenOrThirteen(int startIndex, int endIndex){
		int count = 0;
		while(startIndex <= endIndex){
			if(startIndex%13 == 0){
				System.out.println(startIndex + " is divisible by "+ startIndex);
				count++;
			}			
			else if(startIndex%17 == 0){
					System.out.println(startIndex + " is divisible by "+ startIndex);
					count++;
				}
			if(count == 3)
				break;
			startIndex++;
		}	
		System.out.println("=================================");		
	}
	
	void printFirstTwoNumDivByFiveAndSeven(int startIndex, int endIndex){
		int count = 0;
		while(startIndex <= endIndex){
			if(startIndex%5 == 0 && startIndex%7 == 0){
				System.out.println(startIndex);
				count++;
			}			
			if(count == 2)
				break;
			startIndex++;
		}
	}
	
	public static void main(String[] args){
		AssignmentSix assignmentSix = new AssignmentSix();
		assignmentSix.minReqNumToGenerateSumOfHundred();
		assignmentSix.printFirstThreeNumDivBySeventeenOrThirteen(5,40);
		assignmentSix.printFirstTwoNumDivByFiveAndSeven(5,100);
	}
}