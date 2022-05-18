package nilofar;

class Assignment5{
	
	
	void dispayNum(int startRange, int endRange, int expectedNum){
		int count = 0;
			for (int index = startRange; index<=endRange; index++){
				if(index%7==0 || index%13==0){
					if (index%7==0){
						System.out.println(index +" is divisble by "+7  );
					} else if(index%13==0){
						System.out.println(index +" is divisible by "+13);
				}
						count++;
					if(count==expectedNum)
						break;
			}
		}
	}
	void printOddNum(int startNum, int endNum){
		int count = 0;
		for (int index = startNum; index>=endNum; index--){
			if(index%2!=0){
				System.out.println();
				System.out.println(index);
				count++;
			}	
				if (count==3)
				break;
		}
	}
	
	void sumOfNum(int num1, int num2){
		int temp=0;
		for(int i =num1; i<=num2;i++){
			temp=temp+i;
		}
		System.out.println();
		System.out.println("Sum of five numbers is: "+temp);
	}
	
	void countNum(int startRange, int endRange){
		int count = 0;
		for(int index=startRange;index<=endRange;index++){
			if (index%7==0 || index%13==0){
				count++;
			}
		}
				System.out.println();
				System.out.println("Total count of number divisible by 7 or 13 is: "+count);
		
	}
		public static void main (String[]args){
			Assignment5 assignment5 = new Assignment5();
			assignment5.dispayNum(5,40,5);
			assignment5.printOddNum(20,10);
			assignment5.sumOfNum(1,5);
			assignment5.countNum(5,40);
	}
		
}