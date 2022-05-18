//Assignment-5
package sanchit;

class NumberPlay2{
	
	void requirement1(int startIndex, int endIndex){
		int count=0;
		for(int index= startIndex; index<=endIndex; index++){
			if(index%7 == 0){
				System.out.println(index+" is divisible by 7");
				count++;
			}
			else if(index%13 == 0){
				System.out.println(index+" is divisible by 13");
				count++;
			}
			if(count==5)
				break;
		}
	}
	
	void requirement2(int startIndex, int endIndex){
		int count=0;
		System.out.println("First 3 numbers in reverse order under given range:- ");
		for(int index=endIndex; index>=startIndex; index--){
			if(index%2 != 0){
				System.out.println(index);
				count++;
			}
			if(count==3)
				break;
		}
	}
	
	void requirement3(int startIndex, int endIndex){
		int sum=0;
		for(int index=startIndex; index<=endIndex; index++){
			sum = sum + index;
		}
		System.out.println("Sum is "+sum);
		
	}
	
	void requirement4(int startIndex, int endIndex){
		int count=0;
		for(int index= startIndex; index<=endIndex; index++){
			if(index%7 == 0 || index%13 == 0)
				count++;
		}
		System.out.println("Numbers divisible by 7 or 13, Count is: "+count);
	}
	
	public static void main(String[] args){
		NumberPlay2 numberPlay2 = new NumberPlay2();
		numberPlay2.requirement1(5,40);
		numberPlay2.requirement2(10,20);
		numberPlay2.requirement3(1,5);
		numberPlay2.requirement4(5,40);
	}
}