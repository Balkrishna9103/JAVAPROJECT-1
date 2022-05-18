package prabhat;
class Assignment5{
	
	void method1(int startR,int endR){
		int count=0;
		for(int index=startR; index<=endR; index++){
			if(index%7==0){
				System.out.println(index+ " is divisible by 7");
				count++;
			}
			if(index%13==0){
				System.out.println(index+ " is divisible by 13");
				count++;
			}
			if(count==5)
				break;
		}
		System.out.println("**************************************");
	}
	
	void method2(int sIndex, int eIndex){
		int cnt = 0;
		for(int num = eIndex;num>=sIndex;num--){
			if(num%2!=0){
				System.out.println(num);
				cnt++;
			}
			if(cnt ==3)
				break;
		}
		System.out.println("******************************");
	}
	
	void method3(int startNum, int endNum){
		int sum = 0;
		for(int data = startNum; data<=endNum; data++){
			sum = sum+data;
			}
				System.out.println("Sum of numbers is:" +sum);
				System.out.println(" *******************");
		}
		
	void method4(int start, int end){
		int count =0;
	for (int index=start; index <=end; index++){
		 if(index%7==0 || index%13==0){
		 count++;}
	}
	System.out.println("user define range count all numbers which is divisible by 7 or 13 is : "+count);
	System.out.println("******************************");
	}
			public static void main(String[] args){
			Assignment5 assignment = new Assignment5();
			assignment.method1(5,40);
			assignment.method2(10,20);
			assignment.method3(1,5);
			assignment.method4(5,40);
	}
}