package bhavik;

class Example3{

	void countSum100(){
		int count=0; int sum=0; int num=1;
		while (sum<=100){
			count++;
			sum= sum + num;
			num++;
		}
		System.out.println(count);
	}
	
	void divBy17Or13(int startRange, int endRange){
		int count=0;
		//int index=startRange;
		while (endRange>=startRange){
			if (startRange%17==0){
				System.out.println(startRange+ " is divisible by 17");
				count++;
			}else if (startRange%13==0){
				System.out.println(startRange+ " is divisible by 13");
				count++;
			}
			startRange++;
			if (count == 3)
				break;
		}
	}
	
	void divBy5And7(int startRange, int endRange){
		int count=0;
		while (startRange<=endRange){
			if (startRange%5==0 && startRange%7==0){
				System.out.println(startRange);
				count++;
			}
			startRange++;
			if (count==2)
				break;
		}	
	}
	
	public static void main(String[] args){
		Example3 example3 = new Example3();
		example3.countSum100();
		example3.divBy17Or13(5,40);
		example3.divBy5And7(5,100);
	}
}