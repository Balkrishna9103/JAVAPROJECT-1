package madhuriR;
class NumberCheck{
	void DivNum(int sRange,int eRange){
		int count = 0;
		for (int index = sRange; index<=eRange;index++){
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
		System.out.println("****************************************************");
	}
	void oddNum(int sIndex,int eIndex){
		int cnt = 0;
		for(int num = eIndex;num>=sIndex;num--){
			if(num%2!=0){
				System.out.println(num);
				cnt ++;	
			}
			if(cnt == 3)
				break;	
		}
		System.out.println("****************************************************");	
	}
	void sunNum(int startNum, int endNum){
		int sum = 0;
		for(int data = startNum; data<=endNum;data++){
			sum = sum+data;
		}
		System.out.println("Sum of numbers is "+sum);
		System.out.println("****************************************************");
	}
	void countNum(int strRange,int endRange){
		int count = 0;
		for(int num = strRange; num<=endRange;num++){
			if(num%7==0 || num%13==0){
				count++;
			}	
		}
		System.out.println("Total count of number which is divisible by 7 or 13 is :"+count);
	}
	public static void main(String[] args){
		NumberCheck numbercheck = new NumberCheck();
		numbercheck.DivNum(5,40);
		numbercheck.oddNum(10,20);
		numbercheck.sunNum(1,5);
		numbercheck.countNum(5,40);	
	}
}