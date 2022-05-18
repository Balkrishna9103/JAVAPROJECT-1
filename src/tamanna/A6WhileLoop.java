package tamanna;

public class A6WhileLoop {
	void nosForSum(){
		int counter=0;
		int sum=0;
		while(sum<=100){
			counter++;
			sum=sum+counter;
		}
		System.out.println("Minimum numbers required to generate sum of 100 is : "+counter);
	}
	
	void nosDivisbleBySeventeenOrThirteen(int startIndex,int endIndex){
		int counter=0;
		System.out.println();
		while(startIndex<=endIndex){
			if(startIndex%17==0){
				System.out.println(startIndex +" is divisible by 17.");
				counter++;
			}else if(startIndex%13==0){
				System.out.println(startIndex +" is divisible by 13.");
				counter++;
			}
			if(counter==3){
				break;
			}
			startIndex++;
		}
	}

	void nosDivisibleByFiveAndSeven(int startIndex,int endIndex){
		int counter=0;
		System.out.println("\nNumbers divisible by 5 and 7 are : ");
		while(startIndex<=endIndex){
			if(startIndex%5==0 && startIndex%7==0){
				System.out.println(startIndex);
				counter++;
			}
			if(counter==2){
				break;
			}
			startIndex++;
		}
	}
	public static void main(String[] args){
		A6WhileLoop a6WhileLoop = new A6WhileLoop();
		a6WhileLoop.nosForSum();
		a6WhileLoop.nosDivisbleBySeventeenOrThirteen(5,40);
		a6WhileLoop.nosDivisibleByFiveAndSeven(5,100);
	}
}
