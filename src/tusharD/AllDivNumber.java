package tusharD;

public class AllDivNumber {
	
	void getDivisibleNo(int startIndex, int endIndex){
		if(startIndex<endIndex){
			System.out.println("Numbers divisible by 5");
			for(int index=startIndex;index<=endIndex;index++){
				if (index%5==0){
					System.out.println(index);
				}	
		}
		}else{
			System.out.println("Please specify valid start and end index");
		}
	}
	
	void getDivisibleNum(int startIndex, int endIndex){
		if(startIndex<endIndex){
			System.out.println("Numbers divisible by 3 & 5");
			for(int index=startIndex;index<=endIndex;index++){
				if(index%3==0 && index%5==0){
					System.out.println(index);
				}
			}
		}else{
			System.out.println("Please give valid range");
		}
	}
	
	void getSumOfNumbers(int startIndex, int endIndex){
		if(startIndex<endIndex){
			int sum=0;
			for(int index=startIndex;index<=endIndex;index++){
				sum = sum + index;
			}
			System.out.println("Sum of numbers " + sum);
	}else{
			System.out.println("Please give valid range");
		}
	}
	
	void getOddEvenNumbers(int startIndex, int endIndex){
		if(startIndex<endIndex){
			int sumOfOdd=0;
			int sumOfEven=0;
			for(int index=startIndex;index<=endIndex;index++){
				if(index%2==0){
					sumOfEven = sumOfEven + index;
				}else{
					sumOfOdd = sumOfOdd + index;
				}
			}
			System.out.println("Difference of sum of Odd and even numbers " + (sumOfOdd-sumOfEven));
		}else{
			System.out.println("Please specify valid start and end index ");
		}
	}
	public static void main(String[] args){
		AllDivNumber divno = new AllDivNumber();
		divno.getDivisibleNo(10,30);
		divno.getDivisibleNum(5,18);
		divno.getSumOfNumbers(1,50);
		divno.getOddEvenNumbers(2,9);
	}
	}