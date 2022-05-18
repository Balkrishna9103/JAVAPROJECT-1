package bhushan;

class Example13{
	void div(int num1,int num2){
		for(int index =num1;index<=num2;index++){
			if(index % 5==0){
			System.out.println("Divisible by 5 between 10 & 30 is "+index);	
		}
	 }
    }
	void div1(int num1,int num2){
		for(int index=num1;index<=num2;index++){
			if(index%5==0 && index%3==0){
				System.out.println("No Div By 5 & 3 IS "+index);
			}
			}
	}
	void sum(int num1,int num2){
		int add=0;
		for(int index=num1;index<=num2;index++){
			if(index>=num1 && index<=num2){
				add=add+index;
			}
		}
		System.out.println("Sum of  num is "+add);
	}
	void sumOfodd(int num1,int num2){
		int val1=0;
		int val2=0;
		int ans=0;
		for(int index=num1;index<=num2;index++){
			if(index%2==0){
				val1=val1+index;
		}else{
			val2=val2+index;
		}
	 }
	  ans=val2-val1;
	  System.out.println("Diff Bet sum of Odd no And Even no IS " +ans);
	}
	public static void main(String[] args){
		Example13 example13=new Example13();
		 example13.div(10,30);
		 example13.div1(5,18);
		 example13.sum(1,5);
		 example13.sumOfodd(3,9);
	
	}
	
}