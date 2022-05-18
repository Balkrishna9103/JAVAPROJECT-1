/* Assignment - 5 : 13th April'2022

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
Output : Divisible by 7 or 13, Count is : 8 */
package pramod;

class Assignment5{
	
	void divisible(int startRange, int endRange){
		for(int index = startRange; index <= endRange; index++){
			if(index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}	
	}
	
	void revOdd(int startRange, int endRange){
		int count=0;
		System.out.println("First three odd Numbers in reverse order between " + startRange + " and " + endRange + " are ");
		for(int index = endRange; index>=startRange; index--){
			if(index % 2 != 0 ){
				System.out.println(index);
				count++;
			}
			if(count==3)
					break;
		}
	}
	
	void sum(int startRange, int endRange){
		int count=0;
		for(int index=startRange; index <= endRange; index++){
			count = count + index;
		}
		System.out.println("Sum of all the numbers between " + startRange + " and " + endRange + " is " + count);
	}
	
	void sumDiv(int startRange, int endRange){
		int count = 0;
		for(int index = startRange; index <= endRange; index++){
			if(index % 7 == 0 || index % 13 == 0)
				count++;
		}
		System.out.println("Count of numbers divisible by 7 or 13 in range between " + startRange + " and " + endRange + " is " + count);
	}
		
	public static void main(String[] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.divisible(5,40);
		assignment5.revOdd(10,20);
		assignment5.sum(1,5);
		assignment5.sumDiv(5,40);
	}
			
	
}