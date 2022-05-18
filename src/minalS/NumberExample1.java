package minalS;

//Assignment: 5

class NumberExample1{

	void divBy7Or13(int startRange,int endRange){
		int count=0;
		for(int index=startRange;index<=endRange;index++){
			if(index%7==0 || index%13==0){
				if(index%7==0){
					System.out.println(index+" is divisible by "+7);
				}else if(index%13==0){
				System.out.println(index+" is divisible by "+13);
				}
				count++;
			}
			
			if(count==5)
				break;
		}
	}
	
	void oddReverse(int startRange,int endRange){
		int count=0;
		System.out.println("Odd numbers :");
		for(int index=endRange;index>=startRange;index--){
			if(index%2!=0){
				System.out.println(index);
			count++;
			}
			
			if(count==3)
				break;
		}
	}
	
	void sumOfNum(int startRange,int endRange){
		int sum=0;
		for(int index=startRange;index<=endRange;index++){
			sum=sum+index;
		}
		
		System.out.println("Sum of all given numbers is : "+sum);
	}
	
	void countNumDivBy7Or13(int startRange,int endRange){
		int count=0;
		for(int index=startRange;index<=endRange;index++){
			if(index%7==0 || index%13==0)
				count++;
		}
		
		System.out.println("Divisible by 7 or 13, Count is  : "+count);
	}
	
	public static void main(String[] args){
		NumberExample1 numberExample1=new NumberExample1();
		numberExample1.divBy7Or13(5,40);
		numberExample1.oddReverse(10,20);
		numberExample1.sumOfNum(1,5);
		numberExample1.countNumDivBy7Or13(5,40);
	}
}