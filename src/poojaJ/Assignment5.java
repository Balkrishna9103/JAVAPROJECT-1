package poojaJ;

class Assignment5 {
	void printFirstFiveNumbers(int num1, int num2){
		int count=0;
		for (int index = num1; index<=num2; index++){
				if (index %7==0){
					System.out.println(index + " is divisible by 7");
					count++;
				}
				else if (index%13==0){
					System.out.println(index +" is divisible by 13");
				count++;
				if (count == 5)
				break;	
		}
	}
	}
	
	void printOdd(int num1, int num2){
		int count=0;
		for (int index = num2; index>=num1; index--){
			if (index % 2!= 0){
				System.out.println(index);
				count++;
			}
			if (count == 3)
				break;
		}
	}
	
	void findSum(int num1, int num2){
		int sum=0;
		for (int index= num1; index<=num2; index++){
			sum= sum+index;
		}
		System.out.println("Sum is :"+sum);
	}
	
	void findCount(int num1, int num2){
		int count=0;
		for (int index= num1; index<=num2; index++){
			if (index %7==0 || index%13==0){
				/* if (index % 7 == 0){
					System.out.println(index);
				}
				else
					System.out.println(index);		 */		
				count++;
			}
		}
		System.out.println("Divisible by 7 or 13, Count is :"+count);
	}
	public static void main (String[]args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.printFirstFiveNumbers(5,40);
		System.out.println ("Odd numbers are as follows : ");
		assignment5.printOdd(10,20);
		assignment5.findSum(1,5);
		assignment5.findCount(5,40);
	}
}
