package shekhar;

class NumberRange{

	void divisibleByFive(int startindex,int endindex){
		int count=0;
		for(int i=startindex;i<=endindex;i++){
	
			if(i%5==0){
				System.out.println("Numbers divisible by 5 are :"+i);
				count=count++;
			}
		
		}
	}
		
	void divisibleByFiveAndThree(int startindex,int endindex){
	
		for(int i=startindex;i<=endindex;i++){
	
			if(i%5==0 && i%3==0){
				System.out.println("*******************************************");
				System.out.println("Numbers divisible by 5 and 3 are :"+i);
			}
		
		}	
	} 
	
	void sumOfNumbers(int startindex,int endindex){
		int sum=0;
		for(int i=startindex;i<=endindex;i++){
			sum = sum+i;
		}
		System.out.println("*******************************************");
		System.out.println("Sum of all numbers is:"+sum);
	}
	
	void differenceBetweenOddAndEven(int startindex,int endindex){
		int sumOfevennumber=0;
		int sumOfoddNumber=0;
		int difference=0;
		for(int i=startindex;i<=endindex;i++){
			if(i%2==0){
				sumOfevennumber=sumOfevennumber+i;
			}else{
				sumOfoddNumber=sumOfoddNumber+i;
			}
			if(sumOfevennumber>sumOfoddNumber){
				difference = sumOfevennumber-sumOfoddNumber;
			}else{
				difference = sumOfoddNumber-sumOfevennumber;
			}
			
		}
		System.out.println("*******************************************");
		System.out.println("Sum of odd and even between 3 to 9:"+difference);
		
	}
	
	public static void main(String[] args){
		NumberRange numberrange = new NumberRange();
		numberrange.divisibleByFive(10,30);
		numberrange.divisibleByFiveAndThree(5,18);
		numberrange.sumOfNumbers(1,5);
		numberrange.differenceBetweenOddAndEven(3,9);
	}
}