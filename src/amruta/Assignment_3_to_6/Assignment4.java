/*	Assignment - 4 : 12th April'2022
Write only one program having the following methods. [4 methods in same program] 
1. On user define range print all numbers which is divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	
2. On user define range print all numbers which is divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15
3. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15
4. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6

*/

package amruta.Assignment_3_to_6;

class Assignment4{

	void numDivisibleBy5(int startNum, int endNum){
		for(int num = startNum; num <= endNum; num++){
			if(num % 5 == 0)
				System.out.println(num+" is divisible by 5.\n");
		}
	}
	
	void numDivisibleBy5and3(int startNum, int endNum){
		for(int num = startNum; num <= endNum; num++){
			if(num % 5 == 0 && num % 3 == 0)
				System.out.println(num+" is divisible by 5 and 3.\n");
		}
	}
	
	void sumOfNum(int startNum, int endNum){
		int sum = 0;
		for(int num = startNum; num <= endNum; num++){
			sum = sum + num;
		}
		System.out.println("\nSum of all the numbers in user define range is : "+sum);
	}
	
	void differenceBetweenSumOfOddAndEvenNum(int startNum, int endNum){
		int oddSum = 0;
		int evenSum = 0;
		
		for(int num = startNum; num <= endNum; num++){
			if(num % 2 == 0)
				evenSum = evenSum + num;
			else
				oddSum = oddSum + num;
		}
		
		if(evenSum > oddSum)
			System.out.println("\nDifference between sum of odd numbers and even numbers in a given range is "+(evenSum-oddSum));
		else
			System.out.println("\nDifference between sum of odd numbers and even numbers in a given range is "+(oddSum-evenSum));
	}
	
	public static void main(String[] args){
		Assignment4 assign = new Assignment4();
		assign.numDivisibleBy5(10,30);
		assign.numDivisibleBy5and3(5,18);
		assign.sumOfNum(1,5);
		assign.differenceBetweenSumOfOddAndEvenNum(3,9);
	}
}

