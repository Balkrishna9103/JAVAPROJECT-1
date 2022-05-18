package minalH;

class NumberAnalysis1{
	
	void divisibleBy7Or13(int startR, int endR){
		int count = 0;
		for(int index = startR; index <= endR; index++){
			if(index%7 == 0){
				System.out.println(index+" is divisible by 7");
				count++;
			}
			else if(index%13 == 0){
				System.out.println(index+" is divisible by 13");
				count++;
			}	
			else if(count > 5)
				break;
			}
	}
	
	void printOddNumbers(int startR, int endR){
		int count = 0;
		for(int index = endR; index >= startR; index--){
			if(index % 2 != 0){
				System.out.println(index);
				count++;
			}
			else if(count >= 3)
				break;
		}
	}
	
	void sum(int startR, int endR){
		int sumNumbers=0;
		for(int index=startR; index<=endR; index++){
			sumNumbers=sumNumbers + index;
		}
		System.out.println("Sum is " +sumNumbers);
	}
	
	void countDivBy7Or13(int startR, int endR){
		int count = 0;
		for(int index = startR; index <= endR; index++){
			if(index % 7 == 0 || index % 13 == 0)
				count++;
		}
		System.out.println("Count is : " +count);
	}
	
	public static void main(String[] args){
		NumberAnalysis1 numberAnalysis1 = new NumberAnalysis1();
		numberAnalysis1.divisibleBy7Or13(5,40);
		System.out.println();
		numberAnalysis1.printOddNumbers(10,20);
		System.out.println();
		numberAnalysis1.sum(1,5);
		System.out.println();
		numberAnalysis1.countDivBy7Or13(5,40);
	}
}















