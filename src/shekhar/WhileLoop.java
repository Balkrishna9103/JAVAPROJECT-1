package shekhar;

class WhileLoop{
	void numbersSum(){
		int sum=0;
		int count=0;
		while(sum<=100){
			count++;
			sum=sum+count;
		}
		System.out.println("Numbers required for 100 sum are:"+count);
	}
	
	void divisionOfNumbers(int startRange,int endRange){
		int count=0;
		while(startRange<=endRange){
			if(startRange%13 == 0){
				System.out.println(startRange+ " is divisible by 13");
				count++;
			}else if(startRange%17 == 0){
				System.out.println(startRange+ " is divisible by 17");
				count++;
			}
			startRange++;
			if(count==3)
				break;
			
		}	
	}
	
	void divisibleByFiveAndSeven(int startRange,int endRange){
		int count=0;
		System.out.println("Numbers divisible by five and seven are:");
		while(startRange<=endRange){
			if(startRange%5==0 && startRange%7==0){
				
				System.out.println(+startRange);
				count++;
			}
			startRange++;
			if(count==2)
				break;
		}	
	}
	
	public static void main(String[] args){
		WhileLoop whileloop = new WhileLoop();
		whileloop.numbersSum();
		whileloop.divisionOfNumbers(5,40);
		whileloop.divisibleByFiveAndSeven(5,100);
	}
}