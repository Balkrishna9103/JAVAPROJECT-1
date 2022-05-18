package divya;
class WhileMethod{

	void sumHundred(){
		System.out.println("*******************************");
		int sum=0;
		int count=0;
		int num =0;
		
		while(sum <= 100){
			count++;
			num++;
			sum = sum + num;
		}
		System.out.println("Total numbers to get sum as 100 are : " + count);
	}
	void divisibleBy17Or13(int startRange, int endRange){
		System.out.println("*******************************");
		int count=0;
		while(startRange<=endRange ){			
			if(startRange%13==0){
				System.out.println(startRange + "is divisible by 13");
				count++;
			}
			else if (startRange%17==0){
				System.out.println(startRange + " is divisible by 17");
				count++;
			}
			if(count==3)
				break;
			startRange++;
		}	
	}
	void divisibleByFiveorSeven(int startRange, int endRange){
		System.out.println("*******************************");
		int count=0;
		while(startRange<=endRange ){			
			if(startRange%5==0 && startRange%7==0 ){
				System.out.println(startRange + " " + "is divisible by 5 & 7");
				count++;			
			}
			if(count==2)
				break;
			startRange++;
		}	
	}
			
	public static void main(String[] args){	
		WhileMethod whilemethod = new WhileMethod();
		whilemethod.sumHundred();
		whilemethod.divisibleBy17Or13(5,40);
		whilemethod.divisibleByFiveorSeven(5,100);
	}



}
	
	
	