package minalS;

//Assignment: 6

class WhileLoopAssignment{
	
	void processData(){
		int sum=0;
		int num=0;
		while(sum<=100){
			num++;
			sum=sum+num;
		}
		System.out.println("Required numbers : "+num);
		System.out.println("***********************************************************************");
	}
	
	void divBy17Or13(int startRange,int endRange){
		int num=0;
		while(startRange<=endRange){
			if(startRange%17==0){
				System.out.println(startRange+" is divisible by 17");
				num++;
			}else if(startRange%13==0){
				System.out.println(startRange+" is divisible by 13");
				num++;
			}
			startRange++;
			if(num==3)
				break;
		}
		System.out.println("***********************************************************************");
	}
	
	void divBy5And7(int startRange,int endRange){
		int num=0;
		while(startRange<=endRange){
			if(startRange%5==0 && startRange%7==0){
				num++;
				System.out.println(startRange+" is divisible by 5 and 7");
			}
			startRange++;
			if(num==2)
				break;
		}
	}
	
	public static void main(String[] args){
		WhileLoopAssignment whileLoopAssignment=new WhileLoopAssignment();
		
		whileLoopAssignment.processData();
		whileLoopAssignment.divBy17Or13(5,40);
		whileLoopAssignment.divBy5And7(5,100);
	}
}