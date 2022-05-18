package tamanna;

public class A5NumberRange {
	void divisibleBySevenOrThirteen(int startIndex,int endIndex){
		int counter=0;
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0 || index%13==0){
				if(index%7==0){
					System.out.println(index +" is divisible by 7");
				}
				else{
					System.out.println(index +" is divisible by 13");
				}
				counter++;
			}
			if(counter==5)
				break;
		}
	}
	
	void threeOddNumbers(int startIndex,int endIndex){
		int counter=0;
		System.out.println();
		System.out.println("Three odd numbers are : ");
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2 != 0){
				System.out.println(index);
				counter++;
			}
			if(counter==3)
				break;
		}
	}
	
	void sumOfNumbers(int startIndex,int endIndex){
		int sum=0;
		System.out.println();
		for(int index=startIndex;index<=endIndex;index++){
			sum=sum+index;
		}
		System.out.println("Sum is : "+sum);
	}
	
	void countDivisibleBySevenOrThirteen(int startIndex,int endIndex){
		int counter=0;
		System.out.println();
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0 || index%13==0){
				counter++;
			}
		}
		System.out.println("All numbers divisble by 7 or 13 is : "+counter);
	}
	
	public static void main(String[] args){
		A5NumberRange a5NumberRange=new A5NumberRange();
		a5NumberRange.divisibleBySevenOrThirteen(5,40);
		a5NumberRange.threeOddNumbers(10,20);
		a5NumberRange.sumOfNumbers(1,5);
		a5NumberRange.countDivisibleBySevenOrThirteen(5,40);
	}
}
