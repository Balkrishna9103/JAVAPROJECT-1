package bhavik;

class Example2{
	
	void divBy5Or7(int startRange, int endRange){
		int count=1;
		for (int index=startRange; index<=endRange;index++){
				if (index%7==0)
					System.out.println(index + " is divisible by 7");
				else if (index%13==0)
					System.out.println(index + " is divisible by 13");
			
				if (count==5)
					break;	
				count++;
			}
		}
	
	void oddNumRev(int startRange, int endRange){
		int count=0;
		for (int index=endRange; index>=startRange; index--){
			if (index%2!=0){
				System.out.println(index);
				count++;
			}
			if (count==3){
				break;
			}
		}
	}
	
	void sum(int startRange, int endRange){
		int sum=0;
		for (int index=startRange; index<=endRange; index++){
			sum = sum + index;
		}
		System.out.println("Sum is "+ sum);
	}
	
	void countDivBy7Or13(int startRange, int endRange){
		int count=0;
		for (int index=startRange; index<=endRange; index++){
			if (index%7==0 || index%13==0){
				count++;
			}
		}
		System.out.println("Divisible by 7 or 13, Count is : "+count);
	}

	public static void main(String[] args){
		Example2 example2 = new Example2();
		example2.divBy5Or7(5,40);
		example2.oddNumRev(10,20);
		example2.sum(1,5);
		example2.countDivBy7Or13(5,40);
	}
}