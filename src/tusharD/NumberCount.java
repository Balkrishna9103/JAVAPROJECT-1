package tusharD;

public class NumberCount {
	
	void getNumberCount(){
		int sum =  0;
		int num = 1;
		int count = 0;
		while(sum<=100){
			sum = sum + num;
			count++;
			num++;
		}
		System.out.println("require count to get total sum as 100 are: "+count);
	}
	void getThreeNumbers(int startIndex, int endIndex){
		int count = 0;
		while(startIndex<=endIndex){
			if(startIndex%13==0){
				System.out.println(+startIndex+ " is divisible by 13");
				count++;
			}else if(startIndex%17==0){
				System.out.println(+startIndex+ " is divisible by 17");
				count++;	
			}
			if(count==3){
				break;
			}
			startIndex++;
		}
	}
	void getTwoNumbers(int startIndex, int endIndex){
		int count = 0;
		while(startIndex<=endIndex){
			if(startIndex%5==0 && startIndex%7==0){
				System.out.println("Numbers divisible by 5 & 7 within given range are : "+startIndex);
				count++;
			}
			if(count==2){
				break;
			}
			startIndex++;
		}
	}
		
	public static void main(String[] args){
		NumberCount numbers = new NumberCount();
		numbers.getNumberCount();
		numbers.getThreeNumbers(5,40);
		numbers.getTwoNumbers(5,100);
	}
}