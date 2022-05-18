//Assignment 5
package sandeep;

class Assignment5{
	
	void divFirstFive(int startR, int endR){
		int count = 0;
		for(int index = startR; index <= endR; index++){
			if(index % 7 == 0 || index % 13 == 0){
				if(index % 7 == 0)
				System.out.println(index + " is divisible by 7");
				else
				System.out.println(index + " is divisble by 13");
				count++;
			}
			if(count == 5)
				break;	
		}
		System.out.println("=====================================");
	}
	
	void revOrder(int startR, int endR){
		int count = 0;
		System.out.println("First three odd numbers in reverse order are as below");
		for(int index = endR; index >= startR ; index--){
			if (index % 2 != 0){
				System.out.println(index);
				count++;
			}
			if (count == 3)
				break;
		}
		System.out.println("=====================================");	
	}
	
	void sum(int startR, int endR){
		int num = 0;
		for(int index = startR; index <= endR; index++){
			num = num + index;
		}
		System.out.println("Sum of numbers between " + startR + " and " + endR + " is : " + num);
		System.out.println("=====================================");
	}
	
	void divCount(int startR, int endR){
		int count = 0;
		for(int index = startR; index <= endR; index++){
			if(index % 7 == 0 || index % 13 == 0)
				count++;
		}
		System.out.println("Count of all numbers divisible by 7 or 13 within the given range is: " + count);
		System.out.println("=====================================");
	}
	
	public static void main(String[] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.divFirstFive(5,40);
		assignment5.revOrder(10,20);
		assignment5.sum(1,5);
		assignment5.divCount(5,40);
	}
}