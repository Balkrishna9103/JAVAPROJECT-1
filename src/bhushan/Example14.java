package bhushan;

class Example14{
	 int val3=0;
	void disp1(int val1,int val2){
		for(int index=val1;index<=val2;index++)
			
			if(index%7==0){
				if(val3==5){
					break;
				}
				System.out.println(index+" is Divisible by 7  " );
				val3++;
	}else if(index%13==0){
		System.out.println(index+ " is div by 13 " );
		val3=val3+1;
	}
  }
    void disp2(int num1,int num2){
		int count=0;
		for(int index=num2;index>=num1;index--)
			if(index %2!=0){
				if(count==3){
					break;
				}
				System.out.println("the First three odd num is "+index);
				count++;

			}
	}
	void disp3(int num1,int num2){
		int ans=0;
		for(int test=num1;test<=num2;test++)
			ans=ans+test;
		System.out.println("the SUM is "+ans);
	}
	void disp4(int num1,int num2){
		int count=0;
		for(int index=num1;index<=num2;index++)
			if(index %7==0 || index %13==0){
				count++;
			}
			System.out.println("Count is "+count);
	}
		
   public static void main(String[] args){
	 Example14 example14=new Example14();
	 example14.disp1(5,40);
	 example14.disp2(10,20);
	 example14.disp3(1,5);
	 example14.disp4(5,40);
	 
  }
}