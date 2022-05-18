package tusharB;

class Range{
	
	void divFive( int startnum, int endnum){
		System.out.print("Divisible by 5 numbers are as= ");
		System.out.println("");
		for(int num=startnum;num<=endnum;num++){
						if(num % 5 == 0){
				System.out.println(num);
			}
		}
		System.out.println("");
	}
	
	void divFiveThree( int startnum, int endnum){
		System.out.print("Divisible by 5 & 3 numbers is= ");
		for(int num=startnum;num<=endnum;num++){
						if(num % 5 == 0 && num % 3 == 0){
				System.out.println(num);
			}
		}
		System.out.println("");
	}
	void sum( int startnum, int endnum){
		int sum=0;
		System.out.print("Sum of numbers is= ");
		for(int num=startnum; num<=endnum; num++){
				
				sum=sum+num;
			}
		System.out.println(sum);
		System.out.println("");
	}
	void evenOdd( int startnum, int endnum){
		int sumEven=0;
		int sumOdd=0;
		System.out.print("Even and Odd Result is = ");
		for(int num=startnum; num<=endnum; num++){
				if(num % 2 == 0 ){
					sumEven=sumEven+num;
				}
				else{
					sumOdd=sumOdd+num;
				}
			
			
		}
		System.out.println("" +(sumOdd-sumEven));
	}
	public static void main(String[] args){
		Range range = new Range();
		range.divFive(10,30);
		range.divFiveThree(5,18);
		range.sum(1,5);
		range.evenOdd(3,9);
	}
	
	
}


/*Write only one program having the following methods. [4 methods in same program] 

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
