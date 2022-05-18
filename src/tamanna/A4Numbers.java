package tamanna;

public class A4Numbers {
	
	void divisibleByFive(int startIndex, int endIndex){
		System.out.println("Numbers divisible by five:");
		for(int i=startIndex; i<=endIndex; i++){
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
	
	void divisibleByFiveAndThree(int startIndex, int endIndex){
		System.out.println("Numbers divisible by five and three:");
		for(int i=startIndex; i<=endIndex; i++){
			if(i%5==0 && i%3==0)
			{
				System.out.println(i);
			}
		}
	}
	
	void sumOfNumbers(int startIndex, int endIndex){
		int sum=0;
		for(int i=startIndex; i<=endIndex; i++){
			sum=sum+i;
		}
		System.out.println("Sum is : "+ sum);
	}
	
	void differenceOfSumNumbers(int startIndex, int endIndex){
		int oddSum=0, evenSum=0;
		for(int i=startIndex; i<=endIndex; i++){
			if(i%2==0){
				evenSum=evenSum+i;
			}
			else{
				oddSum=oddSum+i;
			}
		}
		System.out.println("Difference of odd and even sum is : "+ (oddSum-evenSum));
	}
	
	public static void main(String[] args){
		A4Numbers a4Numbers= new A4Numbers();
		a4Numbers.divisibleByFive(10,30);
		a4Numbers.divisibleByFiveAndThree(5,18);
		a4Numbers.sumOfNumbers(1,5);
		a4Numbers.differenceOfSumNumbers(3,9);
	}
}
