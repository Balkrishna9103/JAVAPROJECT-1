//Assignment-4
package sanchit;

class NumberPlay{
	
	void numberDivBy5(int startIndex, int endIndex){
		System.out.println("Numbers, divisible by 5 are below:- ");
		for (int index=startIndex; index<=endIndex; index++){
			if (index%5 == 0){
				System.out.println(index);
			}
		}
	}
	
	void numberDivBy5And3(int startIndex, int endIndex){
		System.out.println("Numbers, divisible by 5 and 3 are below:- ");
		for (int index=startIndex; index<=endIndex; index++){
			if (index%5 == 0 && index%3 == 0){
				System.out.println(index);
			}
		}
	}
	
	void sumOfAllNumbers(int startIndex, int endIndex){
		int sum = 0;
		for(int index=startIndex; index<=endIndex; index++){
			if (index >= startIndex){
				sum = sum + index;
			}
		}
		System.out.println("Sum of all numbers is "+ sum);
	}
	
	void diffOfAllOddandAllEven(int startIndex, int endIndex){
		int sumOfOdd = 0;
		int sumOfEven = 0;
		for(int index=startIndex; index<=endIndex; index++){
			if(index%2 != 0){
				sumOfOdd = sumOfOdd + index;				
			}
			else if(index%2 == 0){
				sumOfEven = sumOfEven + index;
			}
		}
		System.out.println("Subtraction of all odd and all even numbers is "+(sumOfOdd-sumOfEven));
	}
	
	public static void main(String[] args){
		NumberPlay numberPlay = new NumberPlay();
		numberPlay.numberDivBy5(10,30);
		numberPlay.numberDivBy5And3(5,18);
		numberPlay.sumOfAllNumbers(1,5);
		numberPlay.diffOfAllOddandAllEven(3,9);
	}
}