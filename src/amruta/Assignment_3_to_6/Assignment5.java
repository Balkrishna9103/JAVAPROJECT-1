/*	Assignment - 5 : 13th April'2022
1. On user define range print first 5 number which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : 
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
2. Print only first 3 odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
              17
              15
3 Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15
4. On user define range count all numbers which is divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, Count is : 8

*/

package amruta.Assignment_3_to_6;

class Assignment5 {

	void printNumdivisibleby7and13(int startNum, int endNum) {
	
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		int count = 0;
		
			for (int index = startNum; index <= endNum; index++) {
				if(count < 5){
					if (index % 7 == 0){
						System.out.println(index + " is divisible by 7.");
						count++;
					}
					else if (index % 13 == 0){
						System.out.println(index + " is divisible by 13.");
						count++;
					}
				}
			}
	}
	
	void printFirst3OddNumInReverseOrder(int startNum, int endNum){
	
		System.out.println("\nFirst 3 odd Numbers in reverse order :");
		int count = 0;
		
			for (int index = endNum; index >= startNum; index--) {
				if(count < 3){
					if (index % 2 != 0){
						System.out.println(index + " is odd number.");
						count++;
					}
				}
			}
	}
	
	void countAllNumberDicisibleby7and13(int startNum, int endNum){
		int numCount = 0;
	
			for (int index = startNum; index <= endNum; index++) {
				if (index % 7 == 0){
					numCount++;
				}
				else if (index % 13 == 0){
					numCount++;
				}
			}
		System.out.println("\nCount of All Number divisble by 7 and 13 in given rage is : "+numCount);	
	}
	
	public static void main(String[] args){
		Assignment5 assign = new Assignment5();
		assign.printNumdivisibleby7and13(5,40);
		assign.printFirst3OddNumInReverseOrder(10,20);
		assign.countAllNumberDicisibleby7and13(5,40);
	}
}