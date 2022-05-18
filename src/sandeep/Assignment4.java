//Assignment 4
package sandeep;

class Assignment4{
	
	void divByFive(int startIndex, int endIndex){
		System.out.println("The numbers divisible by 5 are: ");
		for(int num = startIndex; num <= endIndex; num++){
			if(num%5 == 0){
				System.out.println(num);
			}
		}
		System.out.println("=====================================");
	}
	
	void divByFiveAndThree(int startIndex, int endIndex){
		System.out.println("The numbers divisible by 5 and 3 are: ");
		for(int num = startIndex; num <= endIndex; num++){
			if(num%5 == 0 && num%3 == 0){
				System.out.println(num);
			}
		}
		System.out.println("=====================================");		
	}
	
	void sumOfNum(int startIndex, int endIndex){
		int sum = 0;
		for(int num = startIndex; num <= endIndex; num++){
			sum = sum + num;
		}
		System.out.println("Sum of given numbers is: " + sum);
		System.out.println("=====================================");
	}
	
	void diffOfOddEven(int startIndex, int endIndex){
		int sumOfOdd = 0, sumOfEven = 0;
		for(int num = startIndex; num <= endIndex; num++){
			if(num%2 == 0){
				sumOfEven = sumOfEven + num;
			}
			else{
				sumOfOdd = sumOfOdd + num;
			}
		}
		System.out.println("Difference between sum of odd numbers and even numbers is: " + (sumOfOdd - sumOfEven));
	} 	
	
	public static void main(String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.divByFive(10,30);
		assignment4.divByFiveAndThree(5,18);
		assignment4.sumOfNum(1,5);
		assignment4.diffOfOddEven(3,9);
	}
}