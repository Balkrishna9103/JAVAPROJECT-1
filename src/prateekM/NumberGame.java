package prateekM;

class NumberGame{
	
	void method1(int start,int end){
		System.out.println("Below numbers are divisible by 5 :");
		for (int index=start;index<=end;index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
		System.out.println("--------------------------------");
	}
	void method2(int start,int end){
		System.out.println("Below numbers are divisible by 5 & 3 :");
		for (int index=start;index<=end;index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
		System.out.println("--------------------------------");

	}
	
	void method3(int start,int end){
			int sum=0;
			for(int index=start; index<=end; index++){
				sum=sum+index;
			}
			System.out.println("Sum of all the numbers of the defined range is = "+sum);
		System.out.println("--------------------------------");

	}
	
	void method4(int start,int end){
			int even=0;
			int odd=0;
			for(int index=start; index<=end; index++){
					if(index%2==0){
						even=even+index;
					}else{
						odd=odd+index;
					}
			}
			System.out.println("Difference of Odd & Even Numbers are : "+(odd-even));
		
	}
	public static void main(String[] args){
		NumberGame number = new NumberGame();
		number.method1(10,30);
		number.method2(5,18);
		number.method3(1,5);
		number.method4(3,9);
	}
}

