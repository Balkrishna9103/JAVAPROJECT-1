package poojaK;
class Method{
	
	void oneMethod(int startIndex,int endIndex){
		int count=0;
		
		for (int num=startIndex;num<=endIndex;num++){
			
			if(num%7==0 || num%13==0){
				if (num%7==0)
					System.out.println(num+ " is Divisible by " + 7);
			
				else 
					System.out.println(num+ " is Divisible by " + 13);
					count++;
			}
			
			if(count==5)
				break; 	
			
		}
		
		System.out.println("************************************");
	}
	
	void twoMethod(){
		int count=0;
		for (int num=20;num>=10;num--){
			if (num%2!=0){
				System.out.println(num);
				count++;
			}
			if (count ==3)
				break;
		}
		System.out.println("********************************");
	}
	void threeMethod(int startIndex, int endIndex){
		int sum = 0;
		for (int num=startIndex;num<=endIndex;num++){
				sum = sum +num;		
		}
		System.out.println("Sum is " + sum );
		System.out.println("********************************");
	}
	void fourMethod(int startIndex,int endIndex){
		int count=0;
		for (int num=startIndex;num<=endIndex;num++){
			if(num%7==0 || num%13==0)
				count++;
		}
			System.out.println("output"+count);
			
		
				
	}
	public static void main(String[] args){
	Method methodForPractice = new Method();
	methodForPractice.oneMethod(5,40);
	methodForPractice.twoMethod();
	methodForPractice.threeMethod(1,5);
	methodForPractice.fourMethod(5,40);
}

}