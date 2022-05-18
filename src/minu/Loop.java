package minu;

class Loop{
	
	void minimumNum(){
		int sum=0;
		int count =0;
		int num =0;
		while(sum<=100){  
			num++;
			count++;
			sum = sum + num;		
		}
		System.out.println("Minimum required numbers to generate sum 100 : " + count);
	}
	
	void divBy17Or13(int start,int end, int totalCount){
		int count=0;
		while(start < end){
			if(start%17 == 0 || start%13 == 0){
				System.out.println("Number divisible by 17 or 13 is: " + start);
				count++;
			}
			start++;
			if(count == totalCount)
				break;
		}
	}
	
	void divBy5And7(int start,int end){
		int count=0;
		while(start < end){
			if(start%5 == 0 && start%7 == 0){
				System.out.println("Number divisible by 5 and 7 is: " + start);
				count++;
			}
			start++;
			if(count == 2)
				break;
		}
	}
	public static void main(String[] args){
		Loop loop = new Loop();
		loop.minimumNum();
		loop.divBy17Or13(5,40,3);
		loop.divBy5And7(5,100);
	}
}