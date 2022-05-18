package ashish;

class Assignment5{	
	void divisibleBySevenOrThirteen(int startIndex, int endIndex){
		int count=0;
		for(int num = startIndex; num <= endIndex; num++){			
			if(num%7==0 || num%13==0){
				if(num%7==0){
					System.out.println(num + " is divisible by 7");
				}
				else if(num%13==0){
					System.out.println(num + " is divisible by 13");
				}
				count++;
			}
			if(count==5){
				break;
			}
		}
		System.out.println("===============================");
	}
	
	void divisibleBySevenOrThirteen2(int startIndex, int endIndex){
		int count=0;    										
		for(int num = startIndex; num <= endIndex; num++){			
				if(num%7==0){
					System.out.println(num + " is divisible by 7");
					count++;  
				}
				else if(num%13==0){
					System.out.println(num + " is divisible by 13");
					count++; 
				}							
			if(count==5){
				break;
			}
		}
		System.out.println("===============================");
	}
	
	void firstThreeOddNoReverseOrder(){
		int count = 0;
		for(int num = 20; num >= 10; num--){
			if(num%2!=0){
				System.out.println(num);
				count++;
			}
			if(count==3){
				break;
			}
		}
		System.out.println("===============================");		
	}
	
	void sumOfAllNumbers(int startIndex, int endIndex){
		int sum=0;
		for(int num = startIndex; num <= endIndex; num++){
			sum = sum+num;			
		}		
		System.out.println("Sum is: "+ sum);
		System.out.println("===============================");		
	}
	
	void countOfNoDivBySevenOrThirteen(int startIndex, int endIndex){
		int count=0;
		for(int num = startIndex; num <= endIndex; num++){			
			if(num%7==0 || num%13==0){				
			count++;
			}			
		}
		System.out.println("Divisible by 7 or 13, Count is :"+ count);			
	}
	
	public static void main(String[] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.divisibleBySevenOrThirteen(5,40);
		assignment5.divisibleBySevenOrThirteen2(5,40);
		assignment5.firstThreeOddNoReverseOrder();
		assignment5.sumOfAllNumbers(1,5);
		assignment5.countOfNoDivBySevenOrThirteen(5,40);
	}
}