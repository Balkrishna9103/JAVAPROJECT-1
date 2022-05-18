package nilofar;

class Assignment6{

	void displayMinRequiredNumber(int startR, int endR){
		int count=0;
			
		while(startR<=endR){
			if(startR%13==0){
				System.out.println(startR + " is divisible by 13");
				count++;
			}else if(startR%17==0){
					System.out.println(startR + " is divisible by 17");
					count++;
			}
			startR++;
			if(count==3)
			break;					
		}
	}	
	void displayMinNumForSum(){
		int sum=0;
		int num=0;
		System.out.println();
		while(sum<=100){
			num++;
			sum=sum+num;
		}
			System.out.println("Minimum numbers required to generate sum 100 :" + num);
	}
	void divByFiveAndSeven(int startRange, int endRange){
		int count=0;
		System.out.println();
		System.out.println("First 2 numbers divisible by 5 and 7 are:");
		while(startRange<=endRange){
			if(startRange%5==0 && startRange%7==0){
				System.out.println(startRange);
				count++;
			}
				startRange++;
				if (count==2)
				break;
		}
	}
	public static void main (String[]args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.displayMinRequiredNumber(5,40);
		assignment6.displayMinNumForSum();
		assignment6.divByFiveAndSeven(5,100);
		
	}
}