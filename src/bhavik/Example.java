package bhavik;

class Example{

	void divisibleBy5(int startRange, int endRange){
		System.out.println("Divisible by 5, Numbers  are: ");
		for (int index = startRange;index <= endRange; index++){
			if (index%5 == 0)
				System.out.println(index);
		}
	}
	
	void divisibleBy5And3(int startRange, int endRange){
		System.out.println("Divisible by 5 & 3, Numbers  are: ");
		for (int index = startRange; index <= endRange; index++){
			if (index % 5==0 && index % 3 ==0)
				System.out.println(index);
		}
	}
	
	void sumOfNumbers(int startRange, int endRange){
		int sum = 0;
		for (int index = startRange ; index <= endRange; index++)
			sum = sum + index;
		System.out.println("Sum is "+ sum);
	}
	
	void diffSumOfOddAndEven(int startRange, int endRange){
		int oddSum = 0; int evenSum = 0;
		for (int index= startRange; index <= endRange; index++){
			if (index%2==0){
				evenSum = evenSum + index;
			}else{
				oddSum = oddSum + index;
			}
		}
		System.out.println("Difference between sum of odd numbers and even numbers : "+ (oddSum-evenSum));
	}
	
	public static void main(String[] args){
		Example example = new Example();
		example.divisibleBy5(10,30);
		example.divisibleBy5And3(5,60);
		example.sumOfNumbers(1,10);
		example.diffSumOfOddAndEven(3,19);
	}
}