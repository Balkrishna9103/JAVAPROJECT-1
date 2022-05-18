package arti;
class PrintNumber2{
	
	void getCount(){
		int sum=0;
		int count=0;
		int num=1;
		while(sum<=100){
			sum=sum+num;
			num++;
			count++;
		}
		System.out.println("Minimum required numbers to get sum of 100 is: " + count +"\n");
	}
	
	void getNumDiv(int startRange, int endRange){ 
		int count=0;
		int num=startRange;
		while(num<=endRange && count<3){
			if(num%13==0){
				System.out.println(num + " is divisible by 13");
				count++; 
			}
			if(num%17==0){
				System.out.println(num + " is divisible by 17" );
				count++;
			}
			
			num++;	
		}
	}
	void getNumDiv2(int startRange,int endRange){
		int count=0;
		int num=startRange;
		System.out.println("\nNumbers divisible by 5 and 7 are :");
		
		while(num<=endRange && count<2){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	public static void main(String args[]){
		PrintNumber2 printNumber= new PrintNumber2();
		printNumber.getCount();
		printNumber.getNumDiv(5,40);
		printNumber.getNumDiv2(5,100);
	}
}