//Assignment 6
package sandeep;

class Assignment6{
	
	void sumHundred(){
		int sum = 0;
		int count = 0;
		while(sum <= 100){
			count++;
			sum = sum + count;
		}
		System.out.println("Miminum numbers required to generate sum 100 are: " + count);
		System.out.println("===============================================");
	}
	
	void firstThree(int startR, int endR){
		int count = 0;
		while(startR <= endR){
			if(startR % 17 == 0){
				System.out.println(startR + " is divisible by 17");
				count++;
			}
			else if(startR % 13 == 0){
				System.out.println(startR + " is divisible by 13");
				count++;
			}
			startR++;
			if(count == 3){
				break;
			}
		}
		System.out.println("===============================================");
	}
	
	void divByFiveAndSeven(int startR, int endR){
		int count = 0;
		while(startR <= endR){
			if(startR % 5 == 0 && startR % 7 == 0){
				System.out.println(startR + " is divisble by 5 and 7");
				count++;
			}
			startR++;
			if(count == 2){
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.sumHundred();
		assignment6.firstThree(5,40);
		assignment6.divByFiveAndSeven(5,100);
		}
}