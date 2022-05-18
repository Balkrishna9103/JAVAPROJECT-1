package minalS;

//Assignment: 4

class Numbers{
	
	void divisibleBy5(int startNum,int endNum){
		System.out.println("Divisible by 5 numbers are :");
		
		for(int index=startNum;index<=endNum;index++){
			if(index%5==0)
				System.out.println(index);
		}
	}
	
	void divisibleBy5And3(int startNum,int endNum){
		System.out.println("Divisible by 5 and 3 numbers are :");
		
		for(int index=startNum;index<=endNum;index++){
			if(index%5==0 && index%3==0)
				System.out.println(index);
		}
	}
	
	void sumOfNumbers(int startNum,int endNum){
		System.out.println("Sum of all numbers is :");
		int sum=0;
		
		for(int index=startNum;index<=endNum;index++){
			sum=sum+index;
		}
		System.out.println(sum);
	}
	
	void diffBetweenOddAndEven(int startNum,int endNum){
		int evenSum=0,oddSum=0;
		
		for(int index=startNum;index<=endNum;index++){
			if(index%2==0){
				evenSum=evenSum+index;
			}else
			oddSum=oddSum+index;
		}
		System.out.println("Difference between even sum and odd sum is : "+(oddSum-evenSum));
	}
	
	public static void main(String[] args){
		Numbers numbers=new Numbers();
		numbers.divisibleBy5(10,30);
		numbers.divisibleBy5And3(5,18);
		numbers.sumOfNumbers(1,5);
		numbers.diffBetweenOddAndEven(3,9);
	}
}