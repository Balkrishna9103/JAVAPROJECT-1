/* Assignment - 4 : 12th April'2022

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
hint : (3+5+7+9) - (4+6+8) = 6 */
package poojaJ;

class Assignment4{
	void divNumbers(int num1, int num2){
		for (int index =num1; index<= num2; index++){
			if (index % 5 ==0){
				System.out.println(index );
			}
		}
	}
	
	void divNumbers1(int startNum, int endNum){
		for (int index = startNum; index<=endNum; index++){
			if (index % 3 == 0 && index % 5 == 0)
				System.out.println("Divisible by 5 & 3, numbers are: " +index);
		}
	}
	
	void findSum(int startNum, int endNum){
		int sum=0; 
		for (int index=startNum; index<=endNum; index++)
			sum= sum+index;		
		System.out.println("sum is :" +sum);
	}
	
	void findDiff(int startNum, int endNum){
		int sumOdd=0;
		int sumEven=0;
		int diff=0;
		for (int index= startNum; index<=endNum; index++){
			if (index %2 == 0)
				sumEven = sumEven+index;
			else
				sumOdd = sumOdd+index;
		}
			diff= sumOdd-sumEven;
			System.out.println("diff is :" +diff);
	}
	
	public static void main(String[]args){
		Assignment4 assignment4 = new Assignment4();
		System.out.println("Divisible by 5 in range 10 to 30 numbers are: ");
		assignment4.divNumbers(10,30);
		System.out.println();
		assignment4.divNumbers1(1,18);
		System.out.println();
		assignment4.findSum(1,5);
		System.out.println();
		assignment4.findDiff(3,9);
	}			
}