package bhushan;

class Example15{
	void disp1(){
		int count=0;
		int val3=0;
		while(count<=100){
			val3++;
			count=count+val3;
		}
		System.out.println("Total "+ val3 +" numbers Req to generate sum 100.");
	}
	
	void disp3(int num1,int num2){
		int count1=0;
		while( num1<=num2 & count1<3){
			if(num1%13==0){
				System.out.println("DIV by 13 "+num1);
				num1++;
				count1++;
			}else if(num1%17==0){
				System.out.println("Div by 17 is "+num1);
				num1++;
				count1++;
			} else{
				num1++;
			}
		}
	}
	
	void disp4(int val1 , int val2){
		while(val1<=val2){
			val1++;
			if(val1%5==0 & val1%7==0){
				System.out.println("Num divisible by 5&7 is "+val1);
			}
			
		}
	}
	
 public static void main(String[] args){
	  Example15 example15=new Example15();
	  example15.disp1();
	  example15.disp3(5,40);
	  example15.disp4(5,100);
 }

}