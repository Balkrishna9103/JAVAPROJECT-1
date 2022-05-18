package ashish;

class Assignment52{	
	void divisibleBySevenOrThirteen(int startIndex, int endIndex){
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
	public static void main(String[] args){
		Assignment52 assignment52 = new Assignment52();
		assignment52.divisibleBySevenOrThirteen(5,40);		
	}
}

