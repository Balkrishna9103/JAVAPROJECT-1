package amar;

class Example{
	
	void display(int startNum, int endNum){
		System.out.println("Numbers which are Divisible by 5: ");
		for(int num=startNum; num<=endNum; num++){
			if(num%5==0)
				System.out.println(num); 
		}
	}
	void displyInfo(int startnum, int endnum){
		System.out.println("Numbers which are Divisible by 5 and 3: ");
		for(int num=startnum; num<=endnum; num++){
			if(num%5==0 && num%3==0)
				System.out.println(num);
		}
	}
	void process(int startnum, int endnum){
		System.out.println("Sum of all numbers are : ");
		int sum=0;
		for(int num=startnum; num<=endnum; num++){
			sum = sum + num;
		}
		System.out.println(sum);
		
	}
	void processInfo(int startnum, int endnum){
		System.out.println("Substraction of Even no.s from odd no.s :");
		int even=0;
		int odd=0;
		int ans=0;
		for(int num=startnum; num<=endnum; num++){
			if(num%2 ==0)
				even= even + num;
			else 
				odd = odd + num;
		}
		
		
			ans = odd - even;
			System.out.println(ans);
		
	}
	public static void main(String[] args){
		Example example = new Example();
		example.display(10,30);
		System.out.println("                                                            ");
		example.displyInfo(5,18);
		System.out.println("                                                            ");
		example.process(1,5);
		System.out.println("                                                            ");
		example.processInfo(3,9);
		System.out.println("                                                            ");
		
	}
}