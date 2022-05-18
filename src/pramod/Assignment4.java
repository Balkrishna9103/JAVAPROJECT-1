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
package pramod;

class Assignment4{
	void divisibleBy5(int startRange, int endRange){
		System.out.println("Divisible by 5 numbers are - ");
		if(startRange<endRange){
			for(int num= startRange; num<=endRange; num++){
				if(num % 5 == 0)
					System.out.println(num);
				
			}
		}
		else if(startRange>endRange){
			for(int num= startRange; num>=endRange; num--){
				if(num%5==0)
					System.out.println(num);
			}
		}
		else
			System.out.println("Please enter valid range");
	}
	
	void divisibleBy5And3(int startRange, int endRange){
		System.out.println("Divisible by 3 and 5 numbers are -");
		if(startRange<endRange){
			for(int num= startRange; num<=endRange; num++){
				if(num%3==0 && num%5==0)
					System.out.println(num);
			}
		}
		else if(startRange>endRange){
			for(int num= startRange; num>=endRange; num--){
				if(num%3==0 && num%5==0)
					System.out.println(num);
			}
		}
		else
			System.out.println("Please enter valid range");
	}
	
	void sumAll(int startRange, int endRange){
		int count=0;
		for(int index=startRange; index<=endRange; index++)
			count=count+index;
		System.out.println("Sum of all the numbers between range " +startRange + " to " +endRange+ " is - " +count);
	}
	
	void difference(int startRange, int endRange){
		int evenNum=0;
		int oddNum=0;
		for(int index=startRange; index<=endRange; index++){
			if(index%2==0)
				evenNum=evenNum+index;
			else
				oddNum=oddNum+index;
		}
		
		if(evenNum>oddNum)
			System.out.println("Difference between sum of even number and odd number between range " +startRange + " and " +endRange + " is "+ (evenNum - oddNum));
		else
			System.out.println("Difference between sum of even number and odd number between range " +startRange + " and " +endRange + " is "+ (oddNum - evenNum));
	}
	
	public static void main(String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.divisibleBy5(30,10);
		assignment4.divisibleBy5And3(10,75);
		assignment4.sumAll(1,25);
		assignment4.difference(1,100);
	}
}