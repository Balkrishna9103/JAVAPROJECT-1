package sunil;

class Numbers{
	void numbersDivisible5(int startrange, int endrange){
		for( int index=startrange; index<=endrange; index ++){
			if (index%5==0)	
			System.out.println("Divisible by 5 numbers are:" + index);
		}
	}
	void numbersDivisible5and3(int startrange, int endrange){
		for( int index=startrange; index<=endrange; index ++){
			if (index%5==0 && index%3==0)	
			System.out.println("Divisible by 5 & 3 numbers are:" + index);
		}
	}
	int Sum=0;
	void numbersofSum(int startrange, int endrange){
		for( int index=startrange; index<=endrange; index ++){
			Sum = Sum+index;			
		}
		System.out.println("Sum of numbers are:" + Sum);
	}
	int OddSum=0;
	int EvenSum=0;
	void numbersDiffOddEven(int startrange, int endrange){
		for( int index=startrange; index<=endrange; index ++){
			if (index%2==0)				
			OddSum = OddSum+index;	
		}
		for( int index=startrange; index<=endrange; index ++){
			if (index%2!=0)				
			EvenSum = EvenSum+index;	
		}
		int Sum = EvenSum-OddSum;
		System.out.println("Difference between sum of odd and even numbers :" + Sum);
	}
	public static void main(String[] args)
	{
		Numbers numbers = new Numbers();
		numbers.numbersDivisible5(10,30);
		numbers.numbersDivisible5and3(5,18);
		numbers.numbersofSum(1,5);
		numbers.numbersDiffOddEven(3,9);
	}
}

